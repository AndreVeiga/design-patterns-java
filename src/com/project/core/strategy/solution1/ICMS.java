package com.project.core.strategy.solution1;

import com.project.core.strategy.Budget;
import com.project.core.strategy.Tax;

import java.math.BigDecimal;

public class ICMS implements Tax {
    public BigDecimal calculateTax(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.1"));
    }
}
