package com.nikhil.suitesphere;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SuiteSphereApplication {


    public static void main(String[] args) {
        SpringApplication.run(SuiteSphereApplication.class, args);
    }

}
