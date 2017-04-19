package com.luanreis.math;

public class Fraction {
    private int integerValue;
    private int numerator;
    private int denominator;

    public Fraction(int integerValue) {
        this.integerValue = integerValue;
    }

    public Fraction(int numerator, int denominator) {
        this.integerValue = numerator;
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int intValue() {
        return integerValue;
    }

    public Fraction add(Fraction that) {
        return new Fraction(this.integerValue + that.integerValue, denominator);
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }
}
