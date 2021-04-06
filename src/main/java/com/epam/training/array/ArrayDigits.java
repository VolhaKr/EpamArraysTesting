package com.epam.training.array;

import java.util.LinkedList;
import java.util.List;

public class ArrayDigits {

    public List<Integer> findDifferentDigits(Array array) {
        if (array.getItems() == null) {
            throw new UnsupportedOperationException();
        }

        int[] arrayItems = array.getItems().clone();

        return findUniqueDigitsElements(arrayItems);
    }

    private static List findUniqueDigitsElements(int[] array) {
        List<Integer> uniqueDigitsNumbers = new LinkedList<>();
        for ( int num : array ) {
            int absNum = Math.abs(num);
            if ((absNum >= 100) && (absNum < 1000)) {
                int hundreds = absNum / 100;
                int tens = (absNum - hundreds * 100) / 10;
                int units = absNum - hundreds * 100 - tens * 10;
                if ((hundreds != tens) && (hundreds != units) && (units != tens)) {
                    uniqueDigitsNumbers.add(num);
                }
            }
        }
        return uniqueDigitsNumbers;
    }
}
