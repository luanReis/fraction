package com.luanreis.math.test;

import com.luanreis.math.Fraction;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReduceFractionTest {

    @Test
    public void reduceToLowestTerms() throws Exception {
        assertEquals(
                new Fraction(3, 4),
                new Fraction(6, 8));
    }

    @Test
    public void reduceToWholeNumber() throws Exception {
        assertEquals(
                new Fraction(6),
                new Fraction(24, 4));
    }

    @Test
    public void reduceToZero() throws Exception {
        assertEquals(
                new Fraction(0),
                new Fraction(0, 128349));
    }
}
