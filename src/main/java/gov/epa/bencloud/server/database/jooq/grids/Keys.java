/*
 * This file is generated by jOOQ.
 */
package gov.epa.bencloud.server.database.jooq.grids;


import gov.epa.bencloud.server.database.jooq.grids.tables.FinalRffCountries;
import gov.epa.bencloud.server.database.jooq.grids.tables.UsCmaq_12kmNation;
import gov.epa.bencloud.server.database.jooq.grids.tables.UsCmaq_12kmNationClipped;
import gov.epa.bencloud.server.database.jooq.grids.tables.UsCounty;
import gov.epa.bencloud.server.database.jooq.grids.tables.UsNation;
import gov.epa.bencloud.server.database.jooq.grids.tables.UsState;
import gov.epa.bencloud.server.database.jooq.grids.tables.records.FinalRffCountriesRecord;
import gov.epa.bencloud.server.database.jooq.grids.tables.records.UsCmaq_12kmNationClippedRecord;
import gov.epa.bencloud.server.database.jooq.grids.tables.records.UsCmaq_12kmNationRecord;
import gov.epa.bencloud.server.database.jooq.grids.tables.records.UsCountyRecord;
import gov.epa.bencloud.server.database.jooq.grids.tables.records.UsNationRecord;
import gov.epa.bencloud.server.database.jooq.grids.tables.records.UsStateRecord;

import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in
 * grids.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<FinalRffCountriesRecord> FINAL_RFF_COUNTRIES_PKEY = Internal.createUniqueKey(FinalRffCountries.FINAL_RFF_COUNTRIES, DSL.name("final_rff_countries_pkey"), new TableField[] { FinalRffCountries.FINAL_RFF_COUNTRIES.GID }, true);
    public static final UniqueKey<UsCmaq_12kmNationRecord> US_CMAQ_12KM_NATION_PKEY = Internal.createUniqueKey(UsCmaq_12kmNation.US_CMAQ_12KM_NATION, DSL.name("us_cmaq_12km_nation_pkey"), new TableField[] { UsCmaq_12kmNation.US_CMAQ_12KM_NATION.GID }, true);
    public static final UniqueKey<UsCmaq_12kmNationClippedRecord> US_CMAQ_12KM_NATION_CLIPPED_PKEY = Internal.createUniqueKey(UsCmaq_12kmNationClipped.US_CMAQ_12KM_NATION_CLIPPED, DSL.name("us_cmaq_12km_nation_clipped_pkey"), new TableField[] { UsCmaq_12kmNationClipped.US_CMAQ_12KM_NATION_CLIPPED.GID }, true);
    public static final UniqueKey<UsCountyRecord> US_COUNTY_PKEY = Internal.createUniqueKey(UsCounty.US_COUNTY, DSL.name("us_county_pkey"), new TableField[] { UsCounty.US_COUNTY.GID }, true);
    public static final UniqueKey<UsNationRecord> US_NATION_PKEY = Internal.createUniqueKey(UsNation.US_NATION, DSL.name("us_nation_pkey"), new TableField[] { UsNation.US_NATION.GID }, true);
    public static final UniqueKey<UsStateRecord> US_STATE_PKEY = Internal.createUniqueKey(UsState.US_STATE, DSL.name("us_state_pkey"), new TableField[] { UsState.US_STATE.GID }, true);
}
