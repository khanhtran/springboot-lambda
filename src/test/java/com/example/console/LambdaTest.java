package com.example.console;

import org.junit.jupiter.api.Test;

public class LambdaTest {

    @Test
    public void testLambdaHandler() {
        Handler handler = new Handler();

        handler.handleRequest("Test", null);

    }
}
