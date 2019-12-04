package com.jupite.gatewayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.jupite")
@EnableDiscoveryClient
@SpringBootApplication
public class GatewayServerApplication{

    public static void main(String[] args) {
        SpringApplication.run(GatewayServerApplication.class, args);
    }
}