package com.retail.promotionsanddiscounts.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class DiscountService implements DiscountServiceIface{
    @Override
    public ResponseEntity<Integer> getDiscounts(String toolCode, Integer discountPercentage) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
}
