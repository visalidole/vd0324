package com.retail.checkout.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class Checkout {

    private String toolCode;
    private Date rentalStartDate;
    private Date rentalEndDate;

}
