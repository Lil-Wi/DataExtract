package com.liw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DataExtractApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataExtractApplication.class, args);
    }

}
