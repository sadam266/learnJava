package com.learn.sorter;

import org.jetbrains.annotations.NotNull;

public class SorterFactory {

    private SorterFactory() {
        throw new UnsupportedOperationException();
    }

    @NotNull
    public static Sorter getFactory(Algorithm algorithm) throws Exception {
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
