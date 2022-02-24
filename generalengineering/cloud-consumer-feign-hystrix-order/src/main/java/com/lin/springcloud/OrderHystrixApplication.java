package com.lin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author LINKEYI
 * @date 2022/02/08/16:22
 */
@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
@EnableCircuitBreaker
public class OrderHystrixApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderHystrixApplication.class, args);
    }
}
