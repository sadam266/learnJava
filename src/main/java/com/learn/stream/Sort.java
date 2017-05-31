package com.learn.stream;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

class Sort {

    static <T extends Comparable<T>> List<T> quicksort(List<T> list) {
        List<T> partitionedList = new ArrayList<>();
        if (list.size() > 0) {
            T pivot = pivot(list);
            List<T> smaller = quicksort(
                    list.stream()
                            .filter(l -> l.compareTo(pivot) < 0)
                            .collect(toList()));
            List<T> bigger = quicksort(
                    list.stream()
                            .filter(l -> l.compareTo(pivot) > 0)
                            .collect(toList()));
            partitionedList.addAll(smaller);
            partitionedList.add(pivot);
            partitionedList.addAll(bigger);
        }
        return partitionedList;
    }

    private static <T extends Comparable<T>> T pivot(List<T> list) {
        if (list.size() > 4) return ninther(list);
        else return list.get(list.size() / 2);
    }

    private static <T extends Comparable<T>> T ninther(List<T> list) {
        int size = list.size() - 1;
        return med3(
                med3(list.subList(0, size / 3)),
                med3(list.subList(size / 3, size * 2 / 3)),
                med3(list.subList(size * 2 / 3, size))
        );
    }

    private static <T extends Comparable<T>> T med3(List<T> list) {
        int size = list.size() - 1;
        return med3(list.get(0), list.get(size / 2), list.get(size));
    }

    private static <T extends Comparable<T>> T med3(T j, T k, T l) {
        return j.compareTo(k) < 0 ?
                k.compareTo(l) < 0 ? k : j.compareTo(l) < 0 ? l : j :
                l.compareTo(j) < 0 ? l : k.compareTo(j) < 0 ? j : k;
    }

}
