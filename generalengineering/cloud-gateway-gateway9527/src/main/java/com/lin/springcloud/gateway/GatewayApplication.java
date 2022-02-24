package com.lin.springcloud.gateway;

import com.lin.springcloud.gateway.filter.TokenFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

/**
 * @author LINKEYI
 * @date 2022/02/09/11:09
 */
@SpringBootApplication
@EnableEurekaClient
public class GatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }

    @Bean
    public TokenFilter tokenFilter(){
        return new TokenFilter();
    }

}
