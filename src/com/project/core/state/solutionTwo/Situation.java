package com.project.core.state.solutionTwo;

import java.math.BigDecimal;

public enum Situation implements SituationBudget {
    APPROVED {
        @Override
        public BigDecimal calculateDiscountExtra(BudgetTwo budget) {
            return budget.getValue().multiply(new BigDecimal("0.02"));
        }

        @Override
        public void finished(BudgetTwo budget) {
            budget.setSituation(Situation.FINISHED);
        }
    },
    IN_ANALYSIS {
        @Override
        public BigDecimal calculateDiscountExtra(BudgetTwo budget) {
            return budget.getValue().multiply(new BigDecimal("0.05"));
        }

        @Override
        public void approves(BudgetTwo budget) {
            budget.setSituation(Situation.APPROVED);
        }

        @Override
        public void disapproves(BudgetTwo budget) {
            budget.setSituation(Situation.DISAPPROVED);
        }
    },
    DISAPPROVED {
        @Override
        public void finished(BudgetTwo budget) {
            budget.setSituation(Situation.FINISHED);
        }
    },
    FINISHED;
}
