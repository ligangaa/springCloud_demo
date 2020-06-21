package com.ligang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
class App3001 {
    public static void main(String[] args) {

        SpringApplication.run(App3001.class);
    }
}
