package com.marcolino.thiago;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationRunner {

    private static Logger log = LoggerFactory.getLogger(ApplicationRunner.class);

    public static void main(String[] args) {
        log.info("Starting the application");
        SpringApplication.run(ApplicationRunner.class, args);
        log.info("Application is running");
    }

}
