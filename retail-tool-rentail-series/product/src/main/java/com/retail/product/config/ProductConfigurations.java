package com.retail.product.config;

import com.retail.product.dao.ProductDao;
import com.retail.product.dao.impl.ProductDaoImpl;
import com.retail.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfigurations {

    private ProductService productService;

    @Bean
    public ProductService productService(ProductDaoImpl productDao) {
        return new ProductService(new ProductDaoImpl());

    }

}
