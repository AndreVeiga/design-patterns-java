package com.project.core;

import com.project.core.state.solutionOne.Budget;
import com.project.core.state.solutionTwo.BudgetTwo;

import java.math.BigDecimal;

public class MainState {
    public static void main(String[] args) throws Exception {
        solutionOne();
        System.out.println("===================");
        solutionTwo();
    }

    public static void solutionOne() throws Exception {
        Budget budget = new Budget(new BigDecimal("400"));

        budget.applyExtraDiscount();

        System.out.println("Value with discount extra in analysis is: " + budget.getValue());

        budget.approves();
        budget.applyExtraDiscount();

        System.out.println("Value with discount extra in approves is: " + budget.getValue());

    }

    public static void solutionTwo() throws Exception {
        var budget = new BudgetTwo(new BigDecimal("400"));

        budget.applyExtraDiscount();

        System.out.println("Value with discount extra in analysis is: " + budget.getValue());

        budget.approves();
        budget.applyExtraDiscount();

        System.out.println("Value with discount extra in approves is: " + budget.getValue());

    }
}
