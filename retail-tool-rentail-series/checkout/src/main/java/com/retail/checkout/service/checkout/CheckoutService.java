package com.retail.checkout.service.checkout;

import com.retail.checkout.calendar.service.HolidayService;
import com.retail.checkout.charge.service.ChargeCalculationService;
import com.retail.checkout.model.Checkout;
import com.retail.checkout.model.ChargeSummary;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("checkout")
public class CheckoutService implements CheckoutServiceIface{

    private HolidayService holidayService;
    private ChargeCalculationService chargeCalculationService;



    @PostMapping("/summary")
    public ResponseEntity<ChargeSummary> checkout(@RequestBody Checkout checkout) {

        //get Rental dates, tool code from the request body
        Date rentalStartDate = checkout.getRentalStartDate();
        Date rentalEndDate = checkout.getRentalEndDate();
        String toolCode = checkout.getToolCode();


        boolean applyHolidayRates = holidayService.applyHolidayRates(rentalStartDate,rentalEndDate);

        ChargeSummary totalCharges =  chargeCalculationService.calculateTotalCharge(toolCode,rentalStartDate,rentalEndDate,applyHolidayRates);

        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @PostMapping("/discountedsummary")
    public ResponseEntity<ChargeSummary> applyDiscount(@RequestBody ChargeSummary chargeSummary, int discountPercentage) {

        ChargeSummary totalCharges = chargeCalculationService.applyDiscounts(chargeSummary, discountPercentage);

        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
}
