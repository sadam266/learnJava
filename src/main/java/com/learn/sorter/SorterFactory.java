package com.learn.sorter;

import org.jetbrains.annotations.NotNull;

class SorterFactory<T extends Comparable<T>> {

    private SorterFactory() {
        throw new UnsupportedOperationException();
    }

    @NotNull
    static Sorter getFactory(Algorithm algorithm) throws Exception {
        switch (algorithm) {
            case QUICKSORT:
                return new Quicksort();
            case MERGESORT:
                return new Mergesort();
            default:
                throw new Exception("Invalid algorithm");
        }
    }
}
