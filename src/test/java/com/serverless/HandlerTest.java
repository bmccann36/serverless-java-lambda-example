package com.serverless;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoHandlerTest {

    @Test
    @DisplayName("lambda test example")
    void runLambdaHandler() {
        Handler handler = new Handler();
        ApiGatewayResponse lambdaOutput = handler.handleRequest(getDemoInput(), null);
        assertEquals("{\"message\":\"Go Serverless v1.x! Your function executed successfully!\",\"input\":{\"path\":\"/user\",\"resource\":\"/user\",\"body\":\"{\\n    \\\"username\\\": \\\"bob\\\"\\n}\",\"httpMethod\":\"POST\"}}", lambdaOutput.getBody());
    }


    private static Map<String, Object> getDemoInput() {
        // create a mock input with a few (but not all) properties that would be on a real one
        Map<String, Object> mockApigLambdaEvent = new HashMap<>();
        mockApigLambdaEvent.put("body", "{\n    \"username\": \"bob\"\n}");
        mockApigLambdaEvent.put("resource", "/user");
        mockApigLambdaEvent.put("path", "/user");
        mockApigLambdaEvent.put("httpMethod", "POST");

        return mockApigLambdaEvent;

    }


}