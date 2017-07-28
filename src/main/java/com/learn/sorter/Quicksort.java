package com.learn.sorter;

class Quicksort<T extends Comparable<T>> implements Sorter<T> {

    private T[] array;

    @Override
    public void setArray(T[] array) {
        this.array = array;
    }

    @Override
    public T[] getArray() {
        return this.array;
    }

    @Override
    public T[] sort() {
        try {
            quicksort(0, getArray().length - 1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return getArray();
    }

    private void quicksort(int lowIndex, int highIndex) {
        int l = lowIndex;
        int h = highIndex;
        T pivot = pivot(lowIndex, highIndex);
        while (l <= h) {
            while (this.array[l].compareTo(pivot) < 0) l++;
            while (this.array[h].compareTo(pivot) > 0) h--;
            if (l <= h) {
                T temp = this.array[h];
                this.array[h] = this.array[l];
                this.array[l] = temp;
                l++;
                h--;
            }
        }
        if (lowIndex < h) quicksort(lowIndex, h);
        if (l < highIndex) quicksort(l, highIndex);
    }

    private T pivot(int lowIndex, int highIndex) {
        if (highIndex - lowIndex > 3) return ninther(lowIndex, highIndex);
        else return array[lowIndex + (highIndex - lowIndex) / 2];
    }

    private T ninther(int lowIndex, int highIndex) {
        int delta = (highIndex - lowIndex + 1) / 3;
        return med3(
                med3(lowIndex, highIndex - 2 * delta),
                med3(lowIndex + delta, highIndex - delta),
                med3(lowIndex + 2 * delta, highIndex)
        );
    }

    private T med3(int lowIndex, int highIndex) {
        int midIndex = lowIndex + (highIndex - lowIndex) / 2;
        return med3(this.array[lowIndex], this.array[midIndex], this.array[highIndex]);
    }

    private T med3(T j, T k, T l) {
        return j.compareTo(k) < 0 ?
                k.compareTo(l) < 0 ? k : j.compareTo(l) < 0 ? l : j :
                l.compareTo(j) < 0 ? l : k.compareTo(j) < 0 ? j : k;
    }
}
