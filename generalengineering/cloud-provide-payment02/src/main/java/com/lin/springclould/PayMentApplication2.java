package com.lin.springclould;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author LINKEYI
 * @date 2022/02/07/14:57
 */
@SpringBootApplication
@EnableEurekaClient
public class PayMentApplication2 {
    public static void main(String[] args) {
        SpringApplication.run(PayMentApplication2.class, args);
    }
}
