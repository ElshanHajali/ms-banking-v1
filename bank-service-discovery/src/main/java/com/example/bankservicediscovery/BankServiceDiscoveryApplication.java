package com.example.bankservicediscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class BankServiceDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankServiceDiscoveryApplication.class, args);
    }

}
