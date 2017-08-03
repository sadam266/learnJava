package com.learn.sorter;

import org.jetbrains.annotations.NotNull;

public class SorterFactory {

    private SorterFactory() {
        throw new UnsupportedOperationException();
    }

    @NotNull
    public static <T extends Comparable<T>> Sorter<T> getSorter(Algorithm algorithm) {
        switch (algorithm) {
            case QUICKSORT:
                return new Quicksort<>();
            case MERGESORT:
                return new Mergesort<>();
        }
        return null;
    }
}
