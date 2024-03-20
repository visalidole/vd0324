package com.retail.promotionsanddiscounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestPromotionAndDiscountApplication {

    public static void main(String[] args) {
        SpringApplication.from(PromotionAndDiscountApplication::main).with(TestPromotionAndDiscountApplication.class).run(args);
    }

}
