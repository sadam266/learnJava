package com.learn.sorter;

class Mergesort<T extends Comparable<T>> {

    private T[] array;

    Mergesort(T[] array) {
        this.array = array;
        mergesort(0, this.array.length - 1);
    }

    T[] getArray(){
        return this.array;
    }

    private void mergesort(int lowIndex, int highIndex) {
        if (lowIndex < highIndex) {
            int mid = lowIndex + (highIndex - lowIndex) / 2;
            mergesort(lowIndex, mid);
            mergesort(mid + 1, highIndex);
            merge(lowIndex, mid, highIndex);
        }
    }

    private void merge(int lowIndex, int midIndex, int highIndex) {
        T[] tmp = this.array.clone();
        int i = lowIndex;
        int j = midIndex + 1;
        int curr = lowIndex;
        while (i <= midIndex && j <= highIndex) {
            if (tmp[i].compareTo(tmp[j]) < 0) {
                this.array[curr] = tmp[i];
                i++;
            } else {
                this.array[curr] = tmp[j];
                j++;
            }
            curr++;
        }
        while (i <= midIndex) {
            this.array[curr] = tmp[i];
            curr++;
            i++;
        }
    }
}