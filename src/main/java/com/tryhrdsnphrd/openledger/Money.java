package com.tryhrdsnphrd.openledger;

import java.math.BigDecimal;

public class Money {

    // This is the only way we are storing them, so that we don't need to worry about arbitrary precision
    private BigDecimal CENTS;

    // This is a constructor, for using an integer
    public Money(int cents) {
        CENTS = BigDecimal.valueOf(cents);
    }

    // If we want to use dollars and cents, we can use this constructor
    public Money(int dollars, int cents) {
        CENTS = BigDecimal.valueOf(dollars * 100 + cents);
    }

    // If we want to use a double, we can use this constructor
    public Money(double dollars) {
        CENTS = BigDecimal.valueOf(dollars * 100);
    }

    // Now the weird one from a string, for use from the JavaFX GUI
    public Money(String dollars) {
        CENTS = new BigDecimal(dollars);
    }

    // This is for extracting the value as an int, otherwise we would have to use the BigDecimal class in SQL, which isn't possible
    public int getCents() {
        return CENTS.intValue();
    }
}
