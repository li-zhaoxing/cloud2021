package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.entities.CommonResult;
import com.atguigu.springcloud.entities.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PaymentController {
    @Autowired
    private PaymentService paymentService;
    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result=paymentService.create(payment);
        int i=1/2;
        if(result!=1){
            return new CommonResult(444,"创建失败",null);
        }else {
            return new CommonResult(200,"创建成功111",payment);
        }
    }
    @GetMapping("/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment=paymentService.selectPaymentById(id);
        if(payment==null){
            return new CommonResult(444,"查询失败",null);
        }else {
            return new CommonResult(200,"查询成功",payment);
        }
    }
}
