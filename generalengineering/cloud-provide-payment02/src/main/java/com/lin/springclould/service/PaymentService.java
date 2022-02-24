package com.lin.springclould.service;

import com.lin.springcloud.pojo.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author LINKEYI
 * @date 2022/02/07/15:26
 */
public interface PaymentService {
    int create(Payment payment);

    Payment queryById(@Param("id") long id);
}
