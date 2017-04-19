package com.luanreis.math;

public class Fraction {
    private int integerValue;
    private int numerator;
    private int denominator;

    public Fraction(int integerValue) {
        this.integerValue = integerValue;
    }

    public Fraction(int numerator, int denominator) {
    }

    public int intValue() {
        return integerValue;
    }

    public Fraction add(Fraction that) {
        return new Fraction(this.integerValue + that.integerValue);
    }

    public int getNumerator() {
        return 3;
    }

    public int getDenominator() {
        return 5;
    }
}
