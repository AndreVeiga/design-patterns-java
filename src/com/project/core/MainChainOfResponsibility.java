package com.project.core;

import com.project.core.chain_of_responsibility.Budget;
import com.project.core.chain_of_responsibility.DiscountCalculator;

import java.math.BigDecimal;

public class MainChainOfResponsibility {

    /**
    public static void main(String[] args) {
        solution();
    }
    */

    public static void solution() {
        Budget budget = new Budget(new BigDecimal("600"), 6);
        DiscountCalculator calculatorDiscount = new DiscountCalculator();

        var discount1 = calculatorDiscount.calculateDiscount(budget);

        var discount2 = calculatorDiscount.calculateDiscountTwo(budget);

        System.out.println("(solution1) Discount result is: " + discount1);
        System.out.println("(solution2) Discount result is: " + discount2);
    }
}
