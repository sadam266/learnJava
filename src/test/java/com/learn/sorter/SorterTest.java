package com.learn.sorter;

import org.junit.Assert;
import org.junit.Test;

public class SorterTest {

    private final Integer[] input = new Integer[]{12, 1, 54, 3, 61, 42, 47, 6};
    private final Integer[] sorted = new Integer[]{1, 3, 6, 12, 42, 47, 54, 61};

    @Test
    public void testQuicksortIntegers() throws Exception {
        Assert.assertArrayEquals(this.sorted, Sorter.sort(this.input, Algorithm.QUICKSORT));
    }

    @Test
    public void testMergesortIntegers() throws Exception {
        Assert.assertArrayEquals(this.sorted, Sorter.sort(this.input, Algorithm.MERGESORT));
    }
}
