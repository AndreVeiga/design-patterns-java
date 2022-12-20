package com.project.core.state.solutionTwo;

import com.project.core.state.solutionTwo.SituationBudget;
import com.project.core.state.solutionTwo.Situation;

import java.math.BigDecimal;

public class BudgetTwo {
    private BigDecimal value;

    private SituationBudget situationBudget;

    public BudgetTwo(BigDecimal value) {
        this.value = value;
        this.situationBudget = Situation.IN_ANALYSIS;
    }

    public BigDecimal getValue() {
        return this.value;
    }

    public void setSituation(Situation situation) {

        this.situationBudget = situation;
    }

    public void applyExtraDiscount() {
        BigDecimal discountExtra = this.situationBudget.calculateDiscountExtra(this);
        this.value = this.value.subtract(discountExtra);
    }

    public void approves() throws Exception {
        this.situationBudget.approves(this);
    }

    public void disapproves() throws Exception {
        this.situationBudget.disapproves(this);
    }

    public void finished() throws Exception {
        this.situationBudget.finished(this);
    }
}
