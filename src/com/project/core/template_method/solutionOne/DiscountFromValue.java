package com.project.core.template_method.solutionOne;


import com.project.core.template_method.Budget;

import java.math.BigDecimal;

public class DiscountFromValue extends Discount {

    public DiscountFromValue(Discount discount) {
        super(discount);
    }

    @Override
    public BigDecimal performCalculation(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.05"));
    }

    @Override
    public boolean toApplyDiscount(Budget budget) {
        return budget.getValue().compareTo(new BigDecimal("500")) > 0;
    }
}
