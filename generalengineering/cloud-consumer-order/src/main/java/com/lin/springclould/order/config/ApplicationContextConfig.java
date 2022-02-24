package com.lin.springclould.order.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author LINKEYI
 * @date 2022/02/07/16:38
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
