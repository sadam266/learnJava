package com.learn.sorter;

import org.junit.Assert;
import org.junit.Test;

public class SorterTest {

    private final Integer[] input = new Integer[]{12, 1, 54, 3, 61, 42, 47, 6};
    private final Integer[] sorted = new Integer[]{1, 3, 6, 12, 42, 47, 54, 61};

    @Test
    @SuppressWarnings("unchecked")
    public void testQuicksortIntegers() throws Exception {
        Sorter sorter = SorterFactory.getFactory(Algorithm.QUICKSORT);
        sorter.setArray(this.input);
        Assert.assertArrayEquals(this.sorted, sorter.sort());
    }

    @Test
    @SuppressWarnings("unchecked")
    public void testMergesortIntegers() throws Exception {
        Sorter sorter = SorterFactory.getFactory(Algorithm.MERGESORT);
        sorter.setArray(this.input);
        sorter.sort();
        Assert.assertArrayEquals(this.sorted, sorter.sort());
    }
}
