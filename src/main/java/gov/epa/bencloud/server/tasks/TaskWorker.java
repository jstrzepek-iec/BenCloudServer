package gov.epa.bencloud.server.tasks;

import static gov.epa.bencloud.server.database.jooq.data.Tables.TASK_QUEUE;
import static gov.epa.bencloud.server.database.jooq.data.Tables.TASK_WORKER;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.UUID;

import org.jooq.Record;
import org.jooq.Result;
import org.jooq.exception.DataAccessException;
import org.jooq.impl.DSL;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;

import gov.epa.bencloud.server.database.JooqUtil;
import gov.epa.bencloud.server.jobs.KubernetesUtil;
import gov.epa.bencloud.server.tasks.local.HIFTaskRunnable;
import gov.epa.bencloud.server.tasks.local.TaskWorkerRunnable;
import gov.epa.bencloud.server.tasks.local.ValuationTaskRunnable;
import gov.epa.bencloud.server.tasks.model.Task;
import gov.epa.bencloud.server.tasks.model.TaskMessage;
import gov.epa.bencloud.server.util.ApplicationUtil;

public class TaskWorker {

	private static final Logger log = LoggerFactory.getLogger(TaskWorker.class);

	public static int maxTaskWorkers = 0;

	private static final int UNRESPONSIVE_TASK_WORKER_TIME_IN_MINUTES = 5; 

	static {
		maxTaskWorkers = Integer.parseInt(ApplicationUtil.getProperty("max.task.workers"));
	}

	public static int getMaxTaskWorkers() {

		return maxTaskWorkers;
	}

	public static int getTaskWorkersCount() {

		return  DSL.using(JooqUtil.getJooqConfiguration())
				.selectCount()
				.from(TASK_WORKER)
				.fetchOne(0, int.class);
	}


	public static void startTaskWorker(Task task) {

		String taskWorkerUuid = UUID.randomUUID().toString();
		
		Boolean transactionSuccessful = false;
		
		try {

			transactionSuccessful = DSL.using(JooqUtil.getJooqConfiguration())
			.transactionResult(ctx -> {

				DSL.using(ctx).insertInto(TASK_WORKER,
						TASK_WORKER.TASK_UUID,
						TASK_WORKER.TASK_WORKER_UUID,
						TASK_WORKER.LAST_HEARTBEAT_DATE
						)
				.values(
						task.getUuid(),
						taskWorkerUuid,
						LocalDateTime.now()
						)
				.execute();

				Result<Record> result = DSL.using(ctx).select().from(TASK_WORKER)
						.where(TASK_WORKER.TASK_WORKER_UUID.eq(taskWorkerUuid))
						.forUpdate()
						.fetch();

				if (result.size() == 0) {
					System.out.println("no task worker for task uuid: " + taskWorkerUuid);
				} else if (result.size() > 1) {
					System.out.println("recieved more than 1 task worker record for task uuid: " + taskWorkerUuid);
				} else {

					DSL.using(ctx).update(TASK_WORKER)
					.set(TASK_WORKER.TASK_UUID, task.getUuid())
					.where(TASK_WORKER.TASK_WORKER_UUID.eq(taskWorkerUuid))
					.execute();


					ObjectMapper mapper = new ObjectMapper();
					ArrayList<TaskMessage> messages = new ArrayList<TaskMessage>();
					messages.add(new TaskMessage("active", "Preparing task runner"));
					
					DSL.using(ctx).update(TASK_QUEUE)
					.set(TASK_QUEUE.TASK_STARTED_DATE, LocalDateTime.now())
					.set(TASK_QUEUE.TASK_PERCENTAGE, 0)
					.set(TASK_QUEUE.TASK_MESSAGE, mapper.writeValueAsString(messages))
					.where(TASK_QUEUE.TASK_UUID.eq(task.getUuid()))
					.execute();
										
					return true;
				}
				
				return false;
			});

		} catch (DataAccessException e1) {
			log.error("Error starting task", e1);
		}

		if (transactionSuccessful) {
			
			Thread t = null;
			
			switch (task.getType()) {
			case "HIF":
				if(ApplicationUtil.usingLocalProperties()) {
					t = new Thread(new HIFTaskRunnable(task.getUuid(), taskWorkerUuid));
					t.start();	
				} else {
					KubernetesUtil.runTaskAsJob(task.getUuid(), taskWorkerUuid);
				}
				break;
				
			case "Valuation":
				if(ApplicationUtil.usingLocalProperties()) {
					t = new Thread(new ValuationTaskRunnable(task.getUuid(), taskWorkerUuid));
					t.start();	
				} else {
					KubernetesUtil.runTaskAsJob(task.getUuid(), taskWorkerUuid);
				}
				break;

			default:
				 t = new Thread(new TaskWorkerRunnable(task.getUuid(), taskWorkerUuid));
				 t.start();
				break;
			}
		} else {
			TaskQueue.returnTaskToQueue(task.getUuid());
		}
	}

	public static void updateTaskWorkerHeartbeat(String taskWorkerUuid) {
		
		try {

			DSL.using(JooqUtil.getJooqConfiguration())
			.transaction(ctx -> {

				//System.out.println("updating heartbeat for: " + taskWorkerUuid);
				
				DSL.using(ctx).update(TASK_WORKER)
				.set(TASK_WORKER.LAST_HEARTBEAT_DATE, LocalDateTime.now())
				.where(TASK_WORKER.TASK_WORKER_UUID.eq(taskWorkerUuid))
				.execute();

			});

		} catch (DataAccessException e1) {
			log.error("Error updating task heartbeat", e1);
		}
	}

	public static void updateTaskWorkerHeartbeat(String taskWorkerUuid, LocalDateTime localDateTime) {
		
		try {

			DSL.using(JooqUtil.getJooqConfiguration())
			.transaction(ctx -> {

				//System.out.println("updating heartbeat for: " + taskWorkerUuid);
				
				DSL.using(ctx).update(TASK_WORKER)
				.set(TASK_WORKER.LAST_HEARTBEAT_DATE, localDateTime)
				.where(TASK_WORKER.TASK_WORKER_UUID.eq(taskWorkerUuid))
				.execute();

			});

		} catch (DataAccessException e1) {
			log.error("Error updating task heartbeat", e1);
		}
	}
	
	public static void checkForUnresponsiveWorkers() {
		
		try {

			DSL.using(JooqUtil.getJooqConfiguration())
			.transaction(ctx -> {

				Result<Record> result = DSL.using(ctx).select()
				.from(TASK_WORKER)
				.forUpdate()
				.fetch();
				
				for (Record record : result) {

					LocalDateTime lastHeartBeatDate = record.getValue(TASK_WORKER.LAST_HEARTBEAT_DATE);
					
					if ((LocalDateTime.now()
							.minusMinutes(UNRESPONSIVE_TASK_WORKER_TIME_IN_MINUTES))
							.isAfter(lastHeartBeatDate)) {

						System.out.println("*** Found unresponsive task worker");

						TaskQueue.returnTaskToQueue(record.getValue(TASK_WORKER.TASK_UUID));
						
						DSL.using(ctx).delete(TASK_WORKER)
						.where(TASK_WORKER.TASK_WORKER_UUID.eq(record.getValue(TASK_WORKER.TASK_WORKER_UUID)))
						.execute();						
						
					}
				}
			});

		} catch (DataAccessException e1) {
			log.error("Error checking for unresponsive workers", e1);
		}		
		
		
		
		
		
		
	}
	
	
}
