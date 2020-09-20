package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

@Component
public class OrderFallbackService implements OrderHystrixService {
    @Override
    public String paymentInfoOK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfoOK , (┬＿┬)";
    }

    @Override
    public String paymentInfoTimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfoTimeOut , (┬＿┬)";
    }
}
