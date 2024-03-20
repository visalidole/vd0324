package com.retail.checkout.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class Tool {


    private String brand;
    private String toolType;
    private String toolCode;
    private String state;
    private String rate;

}
