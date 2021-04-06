package com.epam.training.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayLogicTest {
    Array intput;
    int inputElement;
    List expectedPrimeOutput;
    int[] expectedMinMaxOutput;
    private ArrayLogic arrayLogic;

    @Before
    public void prepare() {
        arrayLogic = new ArrayLogic();
    }


    @Test(expected = UnsupportedOperationException.class)
    public void testFindMinMaxShouldThrowExceptionWhenNullInput() {
        intput = new Array();
        arrayLogic.findMinMax(intput);
    }

    @Test
    public void testFindMinMaxShouldFindDifferent() {
        intput = new Array(new int[]{11, 6, 45, 2, 9});
        expectedMinMaxOutput = new int[]{2, 45};
        Assert.assertArrayEquals(arrayLogic.findMinMax(intput), expectedMinMaxOutput);
    }

    @Test
    public void testFindMinMaxShouldFindSame() {
        intput = new Array(new int[]{5, 5, 5, 5, 5});
        expectedMinMaxOutput = new int[]{5, 5};
        Assert.assertArrayEquals(arrayLogic.findMinMax(intput), expectedMinMaxOutput);
    }

    @Test
    public void testFindMinMaxShouldFindDifferentInNegative() {
        intput = new Array(new int[]{11, 6, 45, -2, 9, 0});
        expectedMinMaxOutput = new int[]{-2, 45};
        Assert.assertArrayEquals(arrayLogic.findMinMax(intput), expectedMinMaxOutput);
    }

    @Test
    public void testFindElementShouldFindWhenOneThroughtPositive() {
        intput = new Array(new int[]{11, 6, 45, 2, 9});
        inputElement = 6;
        Assert.assertTrue(arrayLogic.exists(intput, inputElement));
    }

    @Test
    public void testFindElementShouldFindWhenSeveral() {
        intput = new Array(new int[]{11, 6, 45, 2, 9, 2, 2});
        inputElement = 2;
        Assert.assertTrue(arrayLogic.exists(intput, inputElement));
    }

    @Test
    public void testFindElementShouldNotFindWhenNotExists() {
        intput = new Array(new int[]{11, 6, 45, 2, 9, 2, 2});
        inputElement = -2;
        Assert.assertFalse(arrayLogic.exists(intput, inputElement));
    }

    @Test
    public void testFindElementShouldNotFindWhenThroughDifferent() {
        intput = new Array(new int[]{11, -6, 45, 6, -9});
        inputElement = 9;
        Assert.assertFalse(arrayLogic.exists(intput, inputElement));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testExistShouldThrowExceptionWhenNullInput() {
        intput = new Array();
        arrayLogic.exists(intput, inputElement);
    }

    @Test
    public void testPrimeShouldFindThroughPositive() {
        intput = new Array(new int[]{11, 6, 7, 6, 9, 1, 3, 22, 11, 2, 127});
        expectedPrimeOutput = Arrays.asList(2, 3, 7, 11, 11, 127);
        Assert.assertEquals(expectedPrimeOutput, arrayLogic.findPrimeNumbers(intput));
    }

    @Test
    public void testPrimeShouldNotFindNegativeThroughDifferent() {
        intput = new Array(new int[]{11, -11, 45, 6, -3, 22, -7, 127});
        expectedPrimeOutput = Arrays.asList(11, 127);
        Assert.assertEquals(expectedPrimeOutput, arrayLogic.findPrimeNumbers(intput));
    }

    @Test
    public void testPrimeShouldNotFind0AND1ThroughDifferent() {
        intput = new Array(new int[]{11, 0, 45, 6, -3, 1, 22, -7, 127});
        expectedPrimeOutput = Arrays.asList(11, 127);
        Assert.assertEquals(expectedPrimeOutput, arrayLogic.findPrimeNumbers(intput));
    }

    @Test
    public void testPrimeShouldReturnWhenNoPrimes() {
        intput = new Array(new int[]{12, 0, 45, 6, -3, 1, 22, -7, 222});
        expectedPrimeOutput = new ArrayList();
        Assert.assertEquals(expectedPrimeOutput, arrayLogic.findPrimeNumbers(intput));
    }

    @Test
    public void testPrimeShouldFindRepeatedThroughDifferent() {
        intput = new Array(new int[]{11, -6, 45, 6, -9, 1, 3, 22, 11, -7, 127});
        expectedPrimeOutput = Arrays.asList(3, 11, 11, 127);
        Assert.assertEquals(expectedPrimeOutput, arrayLogic.findPrimeNumbers(intput));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testPrimeShouldThrowExceptionWhenNullInput() {
        intput = new Array();
        arrayLogic.exists(intput, inputElement);
    }


    //TODO: add tests for various scenarios

}
