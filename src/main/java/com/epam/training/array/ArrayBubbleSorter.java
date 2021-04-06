package com.epam.training.array;

public class ArrayBubbleSorter implements ArrayOptionalSorter {

    @Override
    public Array sort(Array array) {
        if (array.getItems() == null) {
            throw new UnsupportedOperationException();
        }
        int[] arraySorted = array.getItems().clone();
        sortBySelection(arraySorted);
        return new Array(arraySorted);
    }

    private int[] sortBySelection(int arr[]) {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for ( int i = 0; i < n - 1; i++ ) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for ( int j = i + 1; j < n; j++ )
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}

