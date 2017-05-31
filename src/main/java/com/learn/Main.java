package com.learn;

import com.learn.sorter.Algorithm;
import com.learn.sorter.Sorter;

public class Main {

    private static final Integer[] input = new Integer[]{12, 1, 54, 3, 61, 42, 47, 6};

    public static void main(String[] args) throws Exception {
        Sorter.sort(input, Algorithm.MERGESORT);

        System.out.println("Dupa");
    }
}
