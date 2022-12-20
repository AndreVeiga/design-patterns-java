package com.project.core.chain_of_responsibility.solutionTwo;

import com.project.core.chain_of_responsibility.Budget;

import java.math.BigDecimal;

public class DiscountFromValueTwo extends DiscountTwo {

    public DiscountFromValueTwo(DiscountTwo discount) {
        super(discount);
    }

    @Override
    public BigDecimal calculateDiscount(Budget budget, BigDecimal discountValue) {
        if(budget.getValue().compareTo(new BigDecimal("500")) > 0) {
            var discount = budget.getValue().multiply(new BigDecimal("0.05"));
            discountValue = discountValue.add(discount);
        }

        return this.next.calculateDiscount(budget, discountValue);
    }
}
