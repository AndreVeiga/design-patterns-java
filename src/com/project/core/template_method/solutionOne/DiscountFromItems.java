package com.project.core.template_method.solutionOne;

import com.project.core.template_method.Budget;

import java.math.BigDecimal;

public class DiscountFromItems extends Discount {
    public DiscountFromItems(Discount discount) {
        super(discount);
    }

    @Override
    public BigDecimal performCalculation(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.1"));
    }

    @Override
    public boolean toApplyDiscount(Budget budget) {
        return budget.getAmountItems() > 5;
    }
}
