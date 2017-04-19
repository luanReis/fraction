package com.luanreis.math.test;

import com.luanreis.math.Fraction;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddFractionsTest {
    @Test
    public void zeroPlusZero() throws Exception {
        Fraction sum = new Fraction(0).add(new Fraction(0));
        assertEquals(0, sum.intValue());
    }

    @Test
    public void nonZeroPlusZero() throws Exception {
        Fraction sum = new Fraction(3).add(new Fraction(0));
        assertEquals(3, sum.intValue());
    }

    @Test
    public void zeroPlusNonZero() throws Exception {
        Fraction sum = new Fraction(0).add(new Fraction(7));
        assertEquals(7, sum.intValue());
    }

    @Test
    public void nonNegativeNonZeroOperands() throws Exception {
        Fraction sum = new Fraction(3).add(new Fraction(2));
        assertEquals(5, sum.intValue());
    }

    @Test
    public void negativeInputsAndNegativeOutput() throws Exception {
        Fraction sum = new Fraction(-2).add(new Fraction(1));
        assertEquals(-1, sum.intValue());
    }

    @Test
    public void nonTrivialButCommonDenominator() throws Exception {
        Fraction sum = new Fraction(1, 5).add(new Fraction(2, 5));
        assertEquals(new Fraction(3, 5), sum);
    }

    @Test
    public void commonDenominatorIsOne() throws Exception {
        Fraction sum = new Fraction(2, 1).add(new Fraction(3, 1));
        assertEquals(5, sum.getNumerator());
        assertEquals(1, sum.getDenominator());
    }
}
