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
}
