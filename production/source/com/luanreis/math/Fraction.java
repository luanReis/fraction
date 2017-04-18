package com.luanreis.math;

public class Fraction {
    private final int integerValue;

    public Fraction(int integerValue) {
        this.integerValue = integerValue;
    }

    public int intValue() {
        return integerValue;
    }

    public Fraction add(Fraction fraction) {
        return this;
    }
}
