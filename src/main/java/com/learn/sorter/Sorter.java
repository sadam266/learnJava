package com.learn.sorter;

public class Sorter {

    public static <T extends Comparable<T>> Comparable[] sort(T[] input) throws Exception {
        return sort(input, Algorithm.QUICKSORT);
    }

    @SuppressWarnings("unchecked")
    public static <T extends Comparable<T>> Comparable[] sort(T[] input, Algorithm algorithm) throws Exception {
        switch (algorithm) {
            case QUICKSORT:
                return new Quicksort(input).getArray();
            case MERGESORT:
                return new Mergesort(input).getArray();
            default:
                throw new Exception("Failed to sort");
        }
    }
}
