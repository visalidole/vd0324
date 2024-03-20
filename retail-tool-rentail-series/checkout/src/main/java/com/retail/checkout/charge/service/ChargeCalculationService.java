package com.retail.checkout.charge.service;

import com.retail.checkout.model.ChargeSummary;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public interface ChargeCalculationService {
    Integer calculateDailyCharge(String toolCode, Date rentalStartDate, Date rentalEndDate, boolean applyHolidayRate);
    ChargeSummary calculateTotalCharge(String toolCode, Date rentalStartDate, Date rentalEndDate, boolean applyHolidayRate);
    ChargeSummary applyDiscounts(ChargeSummary chargeSummary, Integer discountPercentage);
}
