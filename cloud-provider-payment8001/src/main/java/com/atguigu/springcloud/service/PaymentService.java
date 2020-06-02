package com.atguigu.springcloud.service;

import com.atguigu.spring.cloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

public interface PaymentService {

    public  int create(Payment payment);

    public  Payment getPaymentById(@Param("id") int id);

}
