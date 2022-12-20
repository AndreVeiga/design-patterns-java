package com.project.core.state.solutionOne;

import java.math.BigDecimal;

public class InAnalysis extends SituationBudget {

    @Override
    public BigDecimal calculateDiscountExtra(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.05"));
    }


    @Override
    public void approves(Budget budget) {
        budget.setSituation(new Approved());
    }

    @Override
    public void disapproves(Budget budget) {
        budget.setSituation(new Disapproved());
    }
}
