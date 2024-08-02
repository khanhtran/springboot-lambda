package com.example.console;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.springframework.boot.SpringApplication;

import java.util.Date;

public class Handler implements RequestHandler<Object, String> {
    @Override
    public String handleRequest(Object event, Context context) {
        System.out.println("Event: " + event);
        String date = new Date().toString();
        System.out.println("Lambda run at " + date);
        System.out.println("Begin spring application");
        long t = System.currentTimeMillis();
        SpringApplication.run(ConsoleApplication.class);
        System.out.println("End spring application " + (System.currentTimeMillis() - t));
        return "handle " + date;
    }
}
