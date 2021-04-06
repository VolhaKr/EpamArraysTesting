package com.epam.training.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArraySelectionSorterTest {
    Array intput;
    int[] expectedOutput;
    private ArraySelectionSorter arraySelectionSorter;

    @Before
    public void prepare() {
        arraySelectionSorter = new ArraySelectionSorter();
    }

    @Test
    public void testSortShouldSortWhenPositiveNumbers() {
        intput = new Array(new int[]{11, 6, 45, 2, 9});
        expectedOutput = new int[]{2, 6, 9, 11, 45};
        Assert.assertArrayEquals(expectedOutput, arraySelectionSorter.sort(intput).getItems());
    }

    @Test
    public void testSortShouldSortWhenNegativeNumbers() {
        intput = new Array(new int[]{-11, -6, -45, -2, -8});
        expectedOutput = new int[]{-45, -11, -8, -6, -2};
        Assert.assertArrayEquals(expectedOutput, arraySelectionSorter.sort(intput).getItems());
    }

    @Test
    public void testSortShouldSortWhenAllNumbers() {
        intput = new Array(new int[]{11, 0, -45, 5, -8});
        expectedOutput = new int[]{-45, -8, 0, 5, 11};
        Assert.assertArrayEquals(expectedOutput, arraySelectionSorter.sort(intput).getItems());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSortShouldThrowExceptionWhenNullInput() {
        intput = new Array();
        arraySelectionSorter.sort(intput);
    }
}
