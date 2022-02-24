package com.lin.springcloud.order.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author LINKEYI
 * @date 2022/02/08/14:52
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    //RestTemplate 的负载均衡能力
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
