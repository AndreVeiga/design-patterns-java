package com.project.core.state.solutionTwo;

import java.math.BigDecimal;

public interface SituationBudget {
    default BigDecimal calculateDiscountExtra(BudgetTwo budget) {
        return BigDecimal.ZERO;
    }

    default void approves(BudgetTwo budget) throws Exception {
        throw new Exception("budget cannot be approved.");
    }

    default void disapproves(BudgetTwo budget) throws Exception {
        throw new Exception("budget cannot be disapproves.");
    }

    default void finished(BudgetTwo budget) throws Exception {
        throw new Exception("budget cannot be finished.");
    }

    default void inAnalysis(BudgetTwo budget) throws Exception {
        throw new Exception("budget cannot be in analysis.");
    }
}
