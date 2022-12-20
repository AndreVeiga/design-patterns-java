package com.project.core.chain_of_responsibility.solutionOne;

import com.project.core.chain_of_responsibility.Budget;

import java.math.BigDecimal;

public abstract class Discount {
    protected Discount next;

    public Discount(Discount discount) {
        this.next = discount;
    }
    public abstract BigDecimal calculateDiscount(Budget budget);
}
