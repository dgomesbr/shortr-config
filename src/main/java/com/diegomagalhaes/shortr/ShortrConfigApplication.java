package com.diegomagalhaes.shortr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ShortrConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShortrConfigApplication.class, args);
    }
}
