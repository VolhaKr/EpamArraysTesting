package com.epam.training.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayDigitsTester {
    Array intput;
    List expectedDigitsOutput;
    private ArrayDigits arrayDigits;

    @Before
    public void prepare() {
        arrayDigits = new ArrayDigits();
    }

    @Test
    public void testDigitsShouldFindInPositive() {
        intput = new Array(new int[]{891, 111, 1234, 666, 202, 789});
        expectedDigitsOutput = Arrays.asList(891, 789);
        Assert.assertEquals(expectedDigitsOutput, arrayDigits.findDifferentDigits(intput));
    }

    @Test
    public void testDigitsShouldFindNegativeInDifferent() {
        intput = new Array(new int[]{891, -111, 1234, 666, 202, -789});
        expectedDigitsOutput = Arrays.asList(891, -789);
        Assert.assertEquals(expectedDigitsOutput, arrayDigits.findDifferentDigits(intput));
    }


    @Test
    public void testDigitsShouldReturnWhenNoFibonachi() {
        intput = new Array(new int[]{15, 60, 45, 6, -3, 14, 22, -7, 222});
        expectedDigitsOutput = Arrays.asList();
        Assert.assertEquals(expectedDigitsOutput, arrayDigits.findDifferentDigits(intput));
    }

    @Test
    public void testDigitsShouldFindRepeatedThroughDifferent() {
        intput = new Array(new int[]{891, -111, -789, 789, 1234, 666, -111, 202, -789});
        expectedDigitsOutput = Arrays.asList(891, -789, 789, -789);
        Assert.assertEquals(expectedDigitsOutput, arrayDigits.findDifferentDigits(intput));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testDigitsShouldThrowExceptionWhenNullInput() {
        intput = new Array();
        arrayDigits.findDifferentDigits(intput);
    }
}
