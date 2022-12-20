package com.project.core.state.solutionOne;

public class Disapproved extends SituationBudget {
    @Override
    public void finished(Budget budget) {
        budget.setSituation(new Finished());
    }
}
