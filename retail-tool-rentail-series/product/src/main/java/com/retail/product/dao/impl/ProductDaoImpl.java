package com.retail.product.dao.impl;

import com.retail.product.dao.ProductDao;
import com.retail.product.model.Product;
import com.retail.product.model.RentalTool;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductDaoImpl implements ProductDao {
    @Override
    public List<Product> getAllProducts() {
        List<Product> toolList = new ArrayList<>();
                return getToolList();
    }

    @Override
    public List<Product> getByCode(String code) {
        return getToolList().stream().filter(t->t.getToolCode().equalsIgnoreCase(code)).toList();
    }

    @Override
    public List<Product> getByBrand(String brand) {
        return getToolList().stream().filter(t->t.getBrand().equalsIgnoreCase(brand)).toList();
    }

    @Override
    public List<Product> getByType(String type) {
        return getToolList().stream().filter(t->t.getToolType().equalsIgnoreCase(type)).toList();
    }

    @Override
    public List<RentalTool> getRentalTool(List<Product> products) {

        //return state and rate from db.
        return null;
    }

    private List<Product> getToolList() {
        Product tool1 = new Product(
                "STITHL",
                "chainsaw",
                "CHNS"
        );
        Product tool2 = new Product(
                "WERNER",
                "ladder",
                "LADW"
        );
        Product tool3 = new Product(
                "DeWalt",
                "jackhammer",
                "JAKD"
        );
        Product tool4 = new Product(
                "Ridgid",
                "jackhammer",
                "JAKR"
        );
        List<Product> toolList = new ArrayList<>();
        toolList.add(tool1);
        toolList.add(tool2);
        toolList.add(tool3);
        toolList.add(tool4);
        return toolList;

    }

}

