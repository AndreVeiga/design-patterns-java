package com.project.core.chain_of_responsibility.solutionTwo;

import com.project.core.chain_of_responsibility.Budget;

import java.math.BigDecimal;

public abstract class DiscountTwo {
    protected DiscountTwo next;

    public DiscountTwo(DiscountTwo discount) {
        this.next = discount;
    }
    public abstract BigDecimal calculateDiscount(Budget budget, BigDecimal discountValue);
}
