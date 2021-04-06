package com.epam.training.array;

import java.util.Arrays;

public class ArraySorter {

    public Array sort(Array array) {
        if (array.getItems() == null) {
            throw new UnsupportedOperationException();
        }
        int[] arraySorted = array.getItems().clone();
        Arrays.sort(arraySorted);
        return new Array(arraySorted);
    }
}
