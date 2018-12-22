package com.zhao.trail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.EnableZipkinServer;

/**
* @author wxy
*/
@SpringBootApplication
@EnableEurekaClient
@EnableZipkinServer
public class TrailApplication {
 
    public static void main(String[] args) {
        SpringApplication.run(TrailApplication.class, args);
    }
}
