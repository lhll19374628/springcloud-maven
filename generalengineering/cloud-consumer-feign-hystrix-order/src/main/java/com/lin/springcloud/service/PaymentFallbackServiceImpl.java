package com.lin.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author LINKEYI
 * @date 2022/02/09/9:07
 */
@Component
public class PaymentFallbackServiceImpl implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "PaymentFallbackService fall  paymentInfo_OK 服务器出现故障,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "PaymentFallbackService fall  paymentInfo_TimeOut 服务器出现故障,o(╥﹏╥)o";
    }
}
