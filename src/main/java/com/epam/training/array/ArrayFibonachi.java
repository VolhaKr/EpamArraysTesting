package com.epam.training.array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//3.	Get all the Fibonacci numbers in the array (Fibonacci Number);
public class ArrayFibonachi {

    public List<Integer> findFibonachi(Array array) {

        if (array.getItems() == null) {
            throw new UnsupportedOperationException();
        }

        List<Integer> arrFibonachiNumbers = new LinkedList<>();
        List<Integer> fibonachiNumbers = new LinkedList<>();

        int[] sortedCopyArr = array.getItems().clone();
        Arrays.sort(sortedCopyArr);
        fibonachiNumbers = findFibonachi(sortedCopyArr[sortedCopyArr.length - 1]);
        for ( int ar : sortedCopyArr ) {
            if (ar >= 0) {
                if (fibonachiNumbers.contains(ar)) {
                    arrFibonachiNumbers.add(ar);
                }
            }
        }
        return arrFibonachiNumbers;
    }

    private static List<Integer> findFibonachi(int notGreaterVal) {
        List<Integer> fibonachiNumbers = new LinkedList<>();
        int a = 0;
        int b = 1;
        int c = 0;
        fibonachiNumbers.add(0);
        for ( int i = 0; c <= notGreaterVal; i++ ) {
            c = a + b;
            a = b;
            b = c;
            fibonachiNumbers.add(a);
        }
        return fibonachiNumbers;
    }
}
