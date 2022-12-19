package com.project.core.strategy;

import java.math.BigDecimal;

public interface Tax {
    BigDecimal calculateTax(Budget budget);
}
