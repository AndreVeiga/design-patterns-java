package com.project.core.template_method;


import com.project.core.template_method.solutionOne.DiscountFromItems;
import com.project.core.template_method.solutionOne.DiscountFromValue;
import com.project.core.template_method.solutionOne.WithoutDiscount;

import java.math.BigDecimal;

public class DiscountCalculator {
    public BigDecimal calculateDiscount(Budget budget) {
        var discountChain = new DiscountFromValue(new DiscountFromItems(new WithoutDiscount()));
        return discountChain.calculate(budget);
    }
}
