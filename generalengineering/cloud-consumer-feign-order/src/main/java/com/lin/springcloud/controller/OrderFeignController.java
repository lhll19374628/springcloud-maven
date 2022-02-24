package com.lin.springcloud.controller;

import com.lin.springcloud.pojo.CommonResult;
import com.lin.springcloud.pojo.Payment;
import com.lin.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author LINKEYI
 * @date 2022/02/08/15:48
 */
@RestController
@Slf4j
public class OrderFeignController {
    @Autowired
    private PaymentService paymentService;

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        CommonResult result = paymentService.queryById(id);
        return result;
    }

    @GetMapping("/consumer/feign/timeout")
    public String PaymentFeignTimeOut() throws InterruptedException{
        return paymentService.PaymentFeignTimeOut();
    }


}
