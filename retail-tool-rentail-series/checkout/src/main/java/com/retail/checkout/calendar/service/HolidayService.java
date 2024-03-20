package com.retail.checkout.calendar.service;

import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
@Repository
public interface HolidayService {

    public List<Date> getStoreHolidayCalendar();
    public boolean applyHolidayRates(Date rentalStartDate, Date rentalEndDate);

}
