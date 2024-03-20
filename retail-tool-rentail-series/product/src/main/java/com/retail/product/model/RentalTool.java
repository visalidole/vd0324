package com.retail.product.model;

import com.retail.product.model.enums.State;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class RentalTool {

    private Product product;
    private Integer rate;
    private State state;
}
