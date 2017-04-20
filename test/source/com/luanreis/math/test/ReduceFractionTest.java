package com.luanreis.math.test;

import com.luanreis.math.Fraction;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReduceFractionTest {

    @Test
    @Ignore("Wait until GCD is available")
    public void reduceToLowestTerms() throws Exception {
        assertEquals(
                new Fraction(3, 4),
                new Fraction(6, 8));
    }
}
