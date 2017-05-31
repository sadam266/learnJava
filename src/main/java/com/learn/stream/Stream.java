package com.learn.stream;

import java.util.ArrayList;
import java.util.List;

class Stream<T extends Comparable<T>> {

    private List<T> list;

    Stream(List<T> list) {
        this.list = list;
    }

    List<T> sort() {
        return Sort.quicksort(this.list);
    }

//    TODO Fix mergesort
    private List<T> mergesort(List<T> list) {
        List<T> mergedList = new ArrayList<>();
        if (list.size() > 0) {
            mergedList = merge(
                    mergesort(list.subList(0, list.size() / 2)),
                    mergesort(list.subList(list.size() / 2 + 1, list.size() - 1))
            );
        }
        return mergedList;
    }

    @SuppressWarnings("InfiniteRecursion")
    private List<T> merge(List<T> leftList, List<T> rightList) {
        T l = leftList.get(0);
        T r = rightList.get(0);
        if (l.compareTo(r) < 0) {
            List<T> mergedList = merge(leftList.subList(1, leftList.size() - 1), rightList);
            mergedList.add(0, l);
            return mergedList;
        }
        else {
            List<T> mergedList = merge(leftList, rightList.subList(1, leftList.size() - 1));
            mergedList.add(0, r);
            return mergedList;
        }
    }


}
