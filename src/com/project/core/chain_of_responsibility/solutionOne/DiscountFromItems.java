package com.project.core.chain_of_responsibility.solutionOne;

import com.project.core.chain_of_responsibility.Budget;

import java.math.BigDecimal;

public class DiscountFromItems extends Discount {
    public DiscountFromItems(Discount discount) {
        super(discount);
    }

    @Override
    public BigDecimal calculateDiscount(Budget budget) {
        if(budget.getAmountItems() > 5) {
            return budget.getValue().multiply(new BigDecimal("0.1"));
        }

        return this.next.calculateDiscount(budget);
    }
}
