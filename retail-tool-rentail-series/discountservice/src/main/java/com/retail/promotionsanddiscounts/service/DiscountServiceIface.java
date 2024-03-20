package com.retail.promotionsanddiscounts.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


public interface DiscountServiceIface {

    @GetMapping("/discounts")
    ResponseEntity<Integer> getDiscounts(@RequestBody String toolCode, Integer discountPercentage);

}
