package com.retail.checkout.service.checkout;

import com.retail.checkout.model.Checkout;
import com.retail.checkout.model.ChargeSummary;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public interface CheckoutServiceIface {


    @PostMapping("/summary")
    public ResponseEntity<ChargeSummary> checkout(@RequestBody Checkout checkout) ;

    @PostMapping("/discountedsummary")
    public ResponseEntity<ChargeSummary> applyDiscount(@RequestBody ChargeSummary chargeSummary, int discountPercentage);

}
