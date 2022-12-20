package com.project.core.chain_of_responsibility.solutionTwo;

import com.project.core.chain_of_responsibility.Budget;

import java.math.BigDecimal;

public class WithoutDiscountTwo extends DiscountTwo {
    public WithoutDiscountTwo() {
        super(null);
    }

    @Override
    public BigDecimal calculateDiscount(Budget budget, BigDecimal discountValue) {
        return discountValue;
    }
}
