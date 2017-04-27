package com.luanreis.math.test;

import com.luanreis.math.Fraction;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddFractionsTest {
    @Test
    public void zeroPlusZero() throws Exception {
        assertEquals(
                new Fraction(0),
                new Fraction(0).add(new Fraction(0)));
    }

    @Test
    public void nonZeroPlusZero() throws Exception {
        assertEquals(
                new Fraction(3),
                new Fraction(3).add(new Fraction(0)));
    }

    @Test
    public void zeroPlusNonZero() throws Exception {
        assertEquals(
                new Fraction(7),
                new Fraction(0).add(new Fraction(7)));
    }

    @Test
    public void nonNegativeNonZeroOperands() throws Exception {
        assertEquals(
                new Fraction(5),
                new Fraction(3).add(new Fraction(2)));
    }

    @Test
    public void negativeInputsAndNegativeOutput() throws Exception {
        assertEquals(
                new Fraction(-1),
                new Fraction(-2).add(new Fraction(1)));
    }

    @Test
    public void nonTrivialButCommonDenominator() throws Exception {
        assertEquals(
                new Fraction(3, 5),
                new Fraction(1, 5).add(new Fraction(2, 5)));
    }

    @Test
    public void commonDenominatorIsOne() throws Exception {
        assertEquals(
                new Fraction(5, 1),
                new Fraction(2, 1).add(new Fraction(3, 1)));
    }

    @Test
    public void differentDenominatorsWithoutReducing() throws Exception {
        assertEquals(
                new Fraction(5, 6),
                new Fraction(1, 2).add(new Fraction(1, 3)));
    }

    @Test
    public void reduceResultToWholeNumber() throws Exception {
        assertEquals(
                new Fraction(1),
                new Fraction(1, 3).add(new Fraction(2, 3)));
    }

    @Test
    public void oneDenominatorIsAMultipleOfTheOther() throws Exception {
        assertEquals(
                new Fraction(11, 8),
                new Fraction(3, 4).add(new Fraction(5, 8)));
    }

    @Test
    public void commonFactorInDenominators() throws Exception {
        assertEquals(
                new Fraction(23, 6),
                new Fraction(3, 2).add(new Fraction(7, 3)));
    }

    @Test
    public void reduceResultsEvenWhenDenominatorsAreTheSame() throws Exception {
        assertEquals(
                new Fraction(1, 2),
                new Fraction(1, 4).add(new Fraction(1, 4)));
    }

    @Test
    public void negativeFractionAndReducing() throws Exception {
        assertEquals(
                new Fraction(1, 2),
                new Fraction(-1, 4).add(new Fraction(3, 4)));
        assertEquals(
                new Fraction(-1, 8),
                new Fraction(3, 8).add(new Fraction(-1, 2)));
    }

    @Test
    public void negativeSignsEverywhere() throws Exception {
        assertEquals(
                new Fraction(1, 2),
                new Fraction(1, -4).add(new Fraction(-3, -4)));
    }
}
