package com.project.core.chain_of_responsibility;

import com.project.core.chain_of_responsibility.solutionOne.DiscountFromItems;
import com.project.core.chain_of_responsibility.solutionOne.DiscountFromValue;
import com.project.core.chain_of_responsibility.solutionOne.WithoutDiscount;
import com.project.core.chain_of_responsibility.solutionTwo.DiscountFromItemsTwo;
import com.project.core.chain_of_responsibility.solutionTwo.DiscountFromValueTwo;
import com.project.core.chain_of_responsibility.solutionTwo.DiscountTwo;
import com.project.core.chain_of_responsibility.solutionTwo.WithoutDiscountTwo;

import java.math.BigDecimal;

public class DiscountCalculator {
    public BigDecimal calculateDiscount(Budget budget) {
        return new DiscountFromValue(new DiscountFromItems(new WithoutDiscount()))
                .calculateDiscount(budget);
    }

    public BigDecimal calculateDiscountTwo(Budget budget) {
        DiscountTwo discount = new DiscountFromValueTwo(new DiscountFromItemsTwo(new WithoutDiscountTwo()));
        return discount.calculateDiscount(budget, BigDecimal.ZERO);
    }
}
