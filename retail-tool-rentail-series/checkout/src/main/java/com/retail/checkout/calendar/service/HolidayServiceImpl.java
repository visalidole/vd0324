package com.retail.checkout.calendar.service;

import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class HolidayServiceImpl implements HolidayService {
    @Override
    public List<Date> getStoreHolidayCalendar() {
        return null;
    }

    @Override
    public boolean applyHolidayRates(Date rentalStartDate, Date rentalEndDate) {
        return false;
    }
}
