package gov.epa.bencloud;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.fasterxml.jackson.databind.ObjectMapper;

import gov.epa.bencloud.api.model.ValuationConfig;
import io.vavr.collection.Stream;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonNode;

public class ValuationConfigTest {

    @Test
    public void valuationConfigValidParameters() throws Exception {
        String json = "{\"hif_id\": 2, \"hif_instance_id\": 3, \"vf_id\": 4}";

        ObjectMapper objMapper = new ObjectMapper();
        JsonNode node = objMapper.readTree(json);
        ValuationConfig vf = new ValuationConfig(node);
        assertEquals(2, vf.hifId);
        assertEquals(3, vf.hifInstanceId);
        assertEquals(4, vf.vfId);
    }
 

    @ParameterizedTest
    @MethodSource("provideMissingOrWrongTypeData")
    public void valuationConfigMissingOrWrongTypeData(String json) {
        // TODO: Figure out the best way to fail if passed incorrect json
        Exception thrown = assertThrows(NullPointerException.class, () -> {
            ObjectMapper objMapper = new ObjectMapper();
            JsonNode node = objMapper.readTree(json);
            ValuationConfig vf = new ValuationConfig(node);
            // Access variables, so there's a null pointer exception if they're null
            int a = vf.hifId;
            int b = vf.hifInstanceId;
            int c = vf.vfId;
        }
        );
    }
    public static Stream<Arguments> provideMissingOrWrongTypeData() {
        return Stream.of(
            Arguments.of("{}"),
            Arguments.of("{\"hif_id\": \"not_an_int\", \"hif_instance_id\": 1, \"vf_id\": 1}"),
            Arguments.of("{\"hif_instance_id\": 1}")
        );
    }
}
