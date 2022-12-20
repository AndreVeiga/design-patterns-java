package com.project.core.chain_of_responsibility.solutionOne;

import com.project.core.chain_of_responsibility.Budget;

import java.math.BigDecimal;

public class WithoutDiscount extends Discount {
    public WithoutDiscount() {
        super(null);
    }

    @Override
    public BigDecimal calculateDiscount(Budget budget) {
        return BigDecimal.ZERO;
    }
}
