package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {
    int create(Payment payment);
    Payment selectPaymentById(@Param("id") Long id);
}
