package com.epam.training.array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayLogic {

    public int[] findMinMax(Array array) {
        if (array.getItems() == null) {
            throw new UnsupportedOperationException();
        }

        int[] minMax = new int[2];
        int[] sortedCopyArr = array.getItems().clone();
        Arrays.sort(sortedCopyArr);
        minMax[0] = sortedCopyArr[0];
        minMax[1] = sortedCopyArr[sortedCopyArr.length - 1];
        return minMax;
    }

    //TODO: write it using binary search
    public boolean exists(Array array, int item) {
        if (array.getItems() == null) {
            throw new UnsupportedOperationException();
        }

        int[] sortedCopyArr = array.getItems().clone();
        Arrays.sort(sortedCopyArr);
        if ((Arrays.binarySearch(sortedCopyArr, item) >= 0) && (Arrays.binarySearch(sortedCopyArr, item) < sortedCopyArr.length)) {
            return true;
        }
        return false;
    }

    public List<Integer> findPrimeNumbers(Array array) {
        if (array.getItems() == null) {
            throw new UnsupportedOperationException();
        }

        List<Integer> arrPrimeNumbers = new LinkedList<>();
        int[] sortedCopyArr = array.getItems().clone();
        Arrays.sort(sortedCopyArr);
        for ( int ar : sortedCopyArr ) {
            if (ar > 1) {
                if (isPrime(ar)) {
                    arrPrimeNumbers.add(ar);
                }
            }
        }
        return arrPrimeNumbers;
    }

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3)
            return true;
        if (n % 2 == 0 ||
                n % 3 == 0)
            return false;

        for ( int i = 5;
              i * i <= n; i = i + 6 )
            if (n % i == 0 ||
                    n % (i + 2) == 0)
                return false;
        return true;
    }
}
