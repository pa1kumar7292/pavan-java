package com.springboot.demo.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {
    public static void main(String[] args) {
        SortedSet<Integer> sortedSet = new TreeSet<>();

        sortedSet.add(10);
        sortedSet.add(50);
        sortedSet.add(20);
        // follow natural sorting order default.
        System.out.println(sortedSet);

    }
}
