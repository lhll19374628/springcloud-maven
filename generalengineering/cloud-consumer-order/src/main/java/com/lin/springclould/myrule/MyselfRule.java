package com.lin.springclould.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author LINKEYI
 * @date 2022/02/08/15:14
 */
//自定义负载均衡路由规则类
@Configuration
public class MyselfRule {
    @Bean
    public IRule myRULE() {
        // 定义为随机
        return new RoundRobinRule();
    }
}
