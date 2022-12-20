package com.project.core;

import com.project.core.template_method.Budget;
import com.project.core.template_method.DiscountCalculator;

import java.math.BigDecimal;

public class MainTemplateMethod {

    /**
    public static void main(String[] args) {
        solution();
    }
     */

    public static void solution() {
        Budget budget = new Budget(new BigDecimal("400"), 6);

        var calculatorDiscount = new DiscountCalculator();

        var result = calculatorDiscount.calculateDiscount(budget);

        System.out.println("Discount result is: " + result);

    }
}
