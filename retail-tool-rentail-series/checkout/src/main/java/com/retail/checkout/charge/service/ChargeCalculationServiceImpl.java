package com.retail.checkout.charge.service;

import com.retail.checkout.model.ChargeSummary;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ChargeCalculationServiceImpl implements ChargeCalculationService {


    @Override
    public Integer calculateDailyCharge(String toolCode, Date rentalStartDate, Date rentalEndDate, boolean applyHolidayRate) {
        return 0;
    }

    @Override
    public ChargeSummary calculateTotalCharge(String toolCode, Date rentalStartDate, Date rentalEndDate, boolean applyHolidayRate) {
        return null;
    }


    @Override
    public ChargeSummary applyDiscounts(ChargeSummary chargeSummary, Integer discountPercentage) {
        //call the PromotionsAndDiscountsService for applied discounts and then calculate charges.
        return null;
    }

}
