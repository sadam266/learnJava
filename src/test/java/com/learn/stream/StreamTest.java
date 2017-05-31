package com.learn.stream;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamTest {

    private final Integer[] input = new Integer[]{12, 1, 54, 3, 61, 42, 47, 6};
    private final Integer[] sorted = new Integer[]{1, 3, 6, 12, 42, 47, 54, 61};

    @Test
    public void testSortIntegers() {
        List<Integer> inputList = new ArrayList<>();
        Collections.addAll(inputList, this.input);

        List<Integer> sortedList = new ArrayList<>();
        Collections.addAll(sortedList, this.sorted);

        Stream<Integer> integerStream = new Stream<>(inputList);

        Assert.assertArrayEquals(sortedList.toArray(), integerStream.sort().toArray());
    }

}
