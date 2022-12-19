package com.project.core.strategy.solution2;

import com.project.core.strategy.Budget;
import com.project.core.strategy.Tax;

import java.math.BigDecimal;

public enum TaxType2 implements Tax {
    ICMS {
        @Override
        public BigDecimal calculateTax(Budget budget) {
            return budget.getValue().multiply(new BigDecimal("0.1"));
        }
    },
    ISS {
        @Override
        public BigDecimal calculateTax(Budget budget) {
            return budget.getValue().multiply(new BigDecimal("0.06"));
        }
    };
}
