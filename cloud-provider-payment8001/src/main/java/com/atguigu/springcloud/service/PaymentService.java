package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.entities.Payment;

public interface PaymentService {
    int create(Payment payment);
    Payment selectPaymentById(Long id);
}
