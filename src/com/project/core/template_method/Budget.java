package com.project.core.template_method;

import java.math.BigDecimal;

public class Budget {
    private BigDecimal value;
    private int amountItems;

    public Budget(BigDecimal value, int amountItems) {
        this.value = value;
        this.amountItems = amountItems;
    }

    public BigDecimal getValue() {
        return this.value;
    }


    public int getAmountItems() { return this.amountItems; }
}
