package com.epam.training.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayFibonachiTest {

    Array intput;
    List expectedFibonachiOutput;
    private ArrayFibonachi arrayFibonachi;

    @Before
    public void prepare() {
        arrayFibonachi = new ArrayFibonachi();
    }

    @Test
    public void testFibonachiShouldFindThroughPositive() {
        intput = new Array(new int[]{89, 11, 1, 6, 2, 7, 6, 13, 9, 2584, 3, 22, 11, 127});
        expectedFibonachiOutput = Arrays.asList(1, 2, 3, 13, 89, 2584);
        Assert.assertEquals(expectedFibonachiOutput, arrayFibonachi.findFibonachi(intput));
    }

    @Test
    public void testFibonachiShouldNotFindNegativeThroughDifferent() {
        intput = new Array(new int[]{3, -11, -45, 5, -3, 8, -7, 6, 10});
        expectedFibonachiOutput = Arrays.asList(3, 5, 8);
        Assert.assertEquals(expectedFibonachiOutput, arrayFibonachi.findFibonachi(intput));
    }

    @Test
    public void testFibonachiShouldFind0AND1AND2() {
        intput = new Array(new int[]{11, 0, 45, 6, -3, 1, 22, -7, 2});
        expectedFibonachiOutput = Arrays.asList(0, 1, 2);
        Assert.assertEquals(expectedFibonachiOutput, arrayFibonachi.findFibonachi(intput));
    }

    @Test
    public void testFibonachiShouldReturnWhenNoFibonachi() {
        intput = new Array(new int[]{15, 60, 45, 6, -3, 145, 22, -7, 222});
        expectedFibonachiOutput = new ArrayList();
        Assert.assertEquals(expectedFibonachiOutput, arrayFibonachi.findFibonachi(intput));
    }

    @Test
    public void testFibonachiShouldFindRepeatedThroughDifferent() {
        intput = new Array(new int[]{3, -11, 8, -45, 5, -3, 8, -7, 6, 8, 10});
        expectedFibonachiOutput = Arrays.asList(3, 5, 8, 8, 8);
        Assert.assertEquals(expectedFibonachiOutput, arrayFibonachi.findFibonachi(intput));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testPrimeShouldThrowExceptionWhenNullInput() {
        intput = new Array();
        arrayFibonachi.findFibonachi(intput);
    }
}
