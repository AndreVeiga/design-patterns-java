package com.project.core;

import com.project.core.strategy.Budget;
import com.project.core.strategy.solution1.ICMS;
import com.project.core.strategy.solution1.ISS;
import com.project.core.strategy.TaxCalculator;
import com.project.core.strategy.solution2.TaxType2;

import java.math.BigDecimal;

public class MainStrategy {

    /**
    public static void main(String[] args) {
        solutionOne();
        System.out.println("");
        solutionTwo();
    }
    */

    public static void solutionOne() {
        Budget budget = new Budget(new BigDecimal("100"));
        TaxCalculator calculator = new TaxCalculator();

        var resultICMS = calculator.calculate(budget, new ICMS());

        var resultISS = calculator.calculate(budget, new ISS());

        System.out.println("(solution 1 -> ICMS) Tax result is: " + resultICMS);

        System.out.println("(solution 1 -> ISS) Tax result is: " + resultISS);
    }

    public static void solutionTwo() {
        Budget budget = new Budget(new BigDecimal("100"));
        TaxCalculator calculator = new TaxCalculator();

        var resultICMS = calculator.calculate(budget, TaxType2.ICMS);

        var resultISS = calculator.calculate(budget, TaxType2.ISS);

        System.out.println("(solution 2 -> ICMS) Tax result is: " + resultICMS);

        System.out.println("(solution 2 -> ISS) Tax result is: " + resultISS);
    }
}
