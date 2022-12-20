package com.project.core.state.solutionOne;

import java.math.BigDecimal;

public abstract class SituationBudget {
    public BigDecimal calculateDiscountExtra(Budget budget) {
        return BigDecimal.ZERO;
    }
    public void approves(Budget budget) throws Exception {
        throw new Exception("budget cannot be approved.");
    }

    public void disapproves(Budget budget) throws Exception {
        throw new Exception("budget cannot be disapproves.");
    }

    public void finished(Budget budget) throws Exception {
        throw new Exception("budget cannot be finished.");
    }

    public void inAnalysis(Budget budget) throws Exception {
        throw new Exception("budget cannot be in analysis.");
    }
}
