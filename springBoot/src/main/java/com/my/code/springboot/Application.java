package com.my.code.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.my.code")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
