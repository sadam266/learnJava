package com.learn.sorter;

public interface Sorter<T extends Comparable<T>> {

    void setArray(T[] array);

    T[] getArray();

    T[] sort();
}
