package com.project.core.chain_of_responsibility.solutionTwo;

import com.project.core.chain_of_responsibility.Budget;

import java.math.BigDecimal;

public class DiscountFromItemsTwo extends DiscountTwo {
    public DiscountFromItemsTwo(DiscountTwo discount) {
        super(discount);
    }

    @Override
    public BigDecimal calculateDiscount(Budget budget, BigDecimal discountValue) {
        if(budget.getAmountItems() > 5) {
            var discount = budget.getValue().multiply(new BigDecimal("0.1"));
            discountValue = discountValue.add(discount);
        }

        return this.next.calculateDiscount(budget, discountValue);
    }
}
