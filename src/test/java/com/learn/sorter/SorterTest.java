package com.learn.sorter;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class SorterTest {

    private final Integer[] input = new Integer[]{12, 1, 54, 3, 61, 42, 47, 6};
    private final Integer[] sorted = new Integer[]{1, 3, 6, 12, 42, 47, 54, 61};

    @Test
    @SuppressWarnings("unchecked")
    public void testQuicksortIntegers() throws UninitialisedSorterException {
        Sorter sorter = SorterFactory.getSorter(Algorithm.QUICKSORT);
        sorter.setArray(this.input);
        assertArrayEquals(this.sorted, sorter.sort());
    }

    @Test
    @SuppressWarnings("unchecked")
    public void testMergesortIntegers() throws UninitialisedSorterException {
        Sorter sorter = SorterFactory.getSorter(Algorithm.MERGESORT);
        sorter.setArray(this.input);
        sorter.sort();
        assertArrayEquals(this.sorted, sorter.sort());
    }

    @Test
    @SuppressWarnings("unchecked")
    public void testUninitializedQuicksort() throws UninitialisedSorterException {
        Sorter sorter = SorterFactory.getSorter(Algorithm.QUICKSORT);
        try {
            sorter.sort();
        } catch (UninitialisedSorterException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testEmptyArrayQuicksort() throws UninitialisedSorterException {
        Sorter<Integer> sorter = SorterFactory.getSorter(Algorithm.QUICKSORT);
        Integer[] integers = new Integer[0];
        sorter.setArray(integers);
//        TODO
//        sorter.sort();
    }
}
