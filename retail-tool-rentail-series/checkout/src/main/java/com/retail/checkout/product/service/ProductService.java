package com.retail.checkout.product.service;

import com.retail.checkout.model.Tool;
import org.springframework.stereotype.Component;

@Component
public class ProductService implements ProductServiceIface{


    @Override
    public Tool getProduct(String code) {

        // call Product Microservice to get Product
        return null;
    }
}
