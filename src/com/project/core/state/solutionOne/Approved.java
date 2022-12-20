package com.project.core.state.solutionOne;

import java.math.BigDecimal;

public class Approved extends SituationBudget {

    @Override
    public BigDecimal calculateDiscountExtra(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.02"));
    }

    @Override
    public void finished(Budget budget) {
        budget.setSituation(new Finished());
    }
}
