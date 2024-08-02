package com.example.console;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class ConsoleApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(ConsoleApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Application run at " + new Date());
	}
}
