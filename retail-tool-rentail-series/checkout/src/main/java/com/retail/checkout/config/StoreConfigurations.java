package com.retail.checkout.config;
import com.retail.checkout.calendar.service.HolidayService;
import com.retail.checkout.calendar.service.HolidayServiceImpl;
import com.retail.checkout.charge.service.ChargeCalculationService;
import com.retail.checkout.charge.service.ChargeCalculationServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StoreConfigurations {

    private HolidayService holidayService;
    private ChargeCalculationService chargeCalculationService;


    @Bean
    public HolidayService holidayService() {
        return new HolidayServiceImpl();
    }


    @Bean
    public ChargeCalculationService chargeCalculationService() {
        return new ChargeCalculationServiceImpl();
            }

}
