package com.lin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author LINKEYI
 * @date 2022/02/08/14:43
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentApplication04 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication04.class, args);
    }
}
