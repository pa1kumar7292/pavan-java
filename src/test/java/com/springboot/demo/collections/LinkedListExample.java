package com.springboot.demo.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Spliterator;

public class LinkedListExample {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(5);
        list.add(6);
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(3);

        System.out.println(list);

        System.out.println("Size: " + list.size());

        System.out.println("All Elements in the set:" + list);

        System.out.println("Checking element '10' available or not: " + list.contains(10));

        System.out.println("checking set is empty or not:" + list.isEmpty());

        System.out.println("hashcode of set:" + list.hashCode());

        Set<Integer> tempSet = new HashSet<>();
        tempSet.add(20);
        tempSet.add(30);

        list.addAll(tempSet);

        System.out.println("After adding another set to existing set: " + list);

        System.out.println("checking set contains multiple elements '20 and 30'" + list.containsAll(tempSet));

        System.out.println("Removing multiple elements (20, 30) from existing set" + list.removeAll(tempSet));

        System.out.println("After Removing multiple elements (20, 30) from existing set" + list);

        Iterator<Integer> iterator =  list.iterator();

        // 1st way of extracting the set
        for (int i =0; i<list.size(); i++) {
            if (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }

        // 2nd way of extracting the set
        for (Integer num : list) {
            System.out.println(num);
        }

        // 3rd way of extracting the set (better way)
        list.stream().forEach(integer -> {
            System.out.println(integer);
        });

        list.forEach(num -> System.out.println(num));
        // 4th way
        Spliterator<Integer> spliterator = list.spliterator();
        spliterator.forEachRemaining(System.out::println);

        //list.remove(10);
        System.out.println("After removing of element '10': " + list);

        list.clear();
        System.out.println("After clearing the complete set: " + list);
    }
}
