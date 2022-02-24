package com.lin.springcloud.order.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author LINKEYI
 * @date 2022/02/08/14:54
 */
@RestController
@Slf4j
public class OrderConsulController {

    public static final String PAYMENT_URL = "http://cloud-provider-payment";
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("consumer/payment/consul")
    public String getPayment() {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/consul/", String.class);
    }
}