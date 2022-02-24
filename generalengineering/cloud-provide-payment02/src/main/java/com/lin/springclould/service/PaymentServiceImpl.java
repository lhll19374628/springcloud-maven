package com.lin.springclould.service;

import com.lin.springcloud.pojo.Payment;
import com.lin.springclould.dao.PaymentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author LINKEYI
 * @date 2022/02/07/15:27
 */

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment queryById(long id) {
        return paymentDao.queryById(id);
    }
}
