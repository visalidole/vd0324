package com.retail.product.dao;


import com.retail.product.model.Product;
import com.retail.product.model.RentalTool;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public  interface ProductDao {
    public List<Product> getAllProducts();
    List<Product> getByCode(String code);
    List<Product> getByBrand(String brand);
    List<Product> getByType(String type) ;

    List<RentalTool> getRentalTool(List<Product> products);

}
