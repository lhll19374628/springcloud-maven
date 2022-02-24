package com.lin.springcloud.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author LINKEYI
 * @date 2022/02/08/14:51
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderconsulApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderconsulApplication.class, args);
    }
}
