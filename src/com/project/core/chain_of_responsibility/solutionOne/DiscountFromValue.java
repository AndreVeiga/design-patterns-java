package com.project.core.chain_of_responsibility.solutionOne;

import com.project.core.chain_of_responsibility.Budget;

import java.math.BigDecimal;

public class DiscountFromValue extends Discount {

    public DiscountFromValue(Discount discount) {
        super(discount);
    }

    @Override
    public BigDecimal calculateDiscount(Budget budget) {
        if(budget.getValue().compareTo(new BigDecimal("500")) > 0) {
            return budget.getValue().multiply(new BigDecimal("0.05"));
        }

        return this.next.calculateDiscount(budget);
    }
}
