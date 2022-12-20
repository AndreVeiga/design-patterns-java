package com.project.core.template_method.solutionOne;

import com.project.core.template_method.Budget;

import java.math.BigDecimal;

public class WithoutDiscount extends Discount {
    public WithoutDiscount() {
        super(null);
    }

    @Override
    public BigDecimal performCalculation(Budget budget) {
        return BigDecimal.ZERO;
    }

    @Override
    public boolean toApplyDiscount(Budget budget) {
        return true;
    }
}
