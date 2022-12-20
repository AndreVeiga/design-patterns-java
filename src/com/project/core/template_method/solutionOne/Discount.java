package com.project.core.template_method.solutionOne;

import com.project.core.template_method.Budget;

import java.math.BigDecimal;

public abstract class Discount {
    protected Discount next;

    public Discount(Discount discount) {
        this.next = discount;
    }
    protected abstract BigDecimal performCalculation(Budget budget);

    public abstract boolean toApplyDiscount(Budget budget);

    public BigDecimal calculate(Budget budget) {
        if(toApplyDiscount(budget)) {
            return performCalculation(budget);
        }

        return next.calculate(budget);
    }
}
