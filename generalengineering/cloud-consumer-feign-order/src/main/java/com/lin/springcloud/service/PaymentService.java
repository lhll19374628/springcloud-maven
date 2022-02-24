package com.lin.springcloud.service;

import com.lin.springcloud.pojo.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author LINKEYI
 * @date 2022/02/08/15:46
 */
@ComponentScan
@FeignClient(value = "generalengineering-payment")
public interface PaymentService {
    @GetMapping("/payment/get/{id}")
    public CommonResult queryById(@PathVariable("id") Long id);

    //调用生产者微服务名称为generalengineering-payment下边的模拟超时的接口
    @GetMapping("/payment/feign/timeout")
    public String PaymentFeignTimeOut() throws InterruptedException;

}
