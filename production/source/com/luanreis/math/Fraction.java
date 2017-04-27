package com.luanreis.math;

import static com.luanreis.math.NumberTheory.gcd;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int integerValue) {
        this(integerValue, 1);
    }

    public Fraction(int numerator, int denominator) {
        int signOfDenominator = denominator < 0 ? -1 : 1;
        int gcd = gcd(numerator, denominator) * signOfDenominator;
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }

    public Fraction add(Fraction that) {
        return new Fraction(
                this.numerator * that.denominator + that.numerator * this.denominator,
                this.denominator * that.denominator);
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Fraction) {
            Fraction that = (Fraction) other;
            return this.numerator == that.numerator && this.denominator == that.denominator;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return numerator * 31 + denominator;
    }

    @Override
    public String toString() {
        return String.format("%d/%d", numerator, denominator);
    }
}
