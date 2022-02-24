package com.lin.springclould.dao;

import com.lin.springcloud.pojo.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author LINKEYI
 * @date 2022/02/07/15:25
 */
@Mapper
@Repository
public interface PaymentDao {
    int create(Payment payment);

    Payment queryById(@Param("id") long id);

}