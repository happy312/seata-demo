package com.zxy.bank2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Bank2Application {

    public static void main(String[] args) {
        SpringApplication.run(Bank2Application.class, args);
    }

}
