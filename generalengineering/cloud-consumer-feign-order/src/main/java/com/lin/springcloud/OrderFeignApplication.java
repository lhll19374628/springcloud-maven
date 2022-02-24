package com.lin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author LINKEYI
 * @date 2022/02/08/15:43
 */
@SpringBootApplication
@EnableFeignClients//激活Feign的注解  需要加到主启动类上
public class OrderFeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeignApplication.class, args);
    }
}