package com.project.core.state.solutionOne;

import com.project.core.state.solutionOne.InAnalysis;
import com.project.core.state.solutionOne.SituationBudget;

import java.math.BigDecimal;

public class Budget {
    private BigDecimal value;

    private SituationBudget situationBudget;

    public Budget(BigDecimal value) {
        this.value = value;
        this.situationBudget = new InAnalysis();
    }

    public BigDecimal getValue() {
        return this.value;
    }

    public void setSituation(SituationBudget situationBudget) {
        this.situationBudget = situationBudget;
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
