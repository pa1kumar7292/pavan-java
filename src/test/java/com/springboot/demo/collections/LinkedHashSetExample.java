package com.springboot.demo.collections;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(10);
        linkedHashSet.add(50);
        linkedHashSet.add(20);

        // it will maintain insertion order
        System.out.println(linkedHashSet);
    }
}
