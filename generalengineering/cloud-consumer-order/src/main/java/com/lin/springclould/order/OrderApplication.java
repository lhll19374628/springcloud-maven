package com.lin.springclould.order;

import com.lin.springclould.myrule.MyselfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author LINKEYI
 * @date 2022/02/07/16:29
 */

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "generalengineering-payment", configuration = MyselfRule.class)
public class OrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }
}
