package com.epam.training.array;

//Implement Array class which is a wrapper over an array of integer numbers.
//
//        Implement constructors that allow us to create objects of this type in several ways;
//        Implement get and set methods if necessary (try to keep class immutable);
//        Override methods of the class Object(toString(), equals(), hashCode()).
//        No logic should be put in this Array class
//The program should support the following operations:
//
//        Sorting an array;
//        Search for an array item (use a binary search algorithm);
//        Search the max (maximum value) and min (minimum value) array items;
//        Get all the primes in the array (Prime Number);
//        Optional tasks:
//
//        Do array sorting with several algorithms (hint: one interface and several implementations);
//        Support for three options for filling array items: from the console, from the file and using random number generation.
//        Get all the Fibonacci numbers in the array (Fibonacci Number);
//        Get all three-digit numbers with no identical digits in the decimal notation;

//TODO: write a wrapper class for a java int array, make this class immutable
public class Array {

    private int[] items;

    public Array(int[] items) {
        this.items = items;
    }

    public Array() {
        super();
    }

    public Array(int length) {
        this.items = new int[length];
    }

    public int[] getItems() {
        return items;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
