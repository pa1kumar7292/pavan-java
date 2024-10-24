package com.springboot.demo.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Spliterator;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(5);
        set.add(6);
        set.add(3);
        set.add(4);
        set.add(1);
        set.add(3);

        System.out.println("Size: " + set.size());

        System.out.println("All Elements in the set:" + set);

        //System.out.println("Checking element '10' available or not: " + set.contains(10));

        //System.out.println("checking set is empty or not:" + set.isEmpty());

        //System.out.println("hashcode of set:" + set.hashCode());

        Set<Integer> tempSet = new HashSet<>();
        tempSet.add(20);
        tempSet.add(30);

        set.addAll(tempSet);

//        System.out.println("After adding another set to existing set: " + set);
//
//        System.out.println("checking set contains multiple elements '20 and 30'" + set.containsAll(tempSet));
//
//        System.out.println("Removing multiple elements (20, 30) from existing set" + set.removeAll(tempSet));
//
//        System.out.println("After Removing multiple elements (20, 30) from existing set" + set);

//        Iterator<Integer> iterator =  set.iterator();
//
//        // 1st way of extracting the set
//        for (int i =0; i<set.size(); i++) {
//            if (iterator.hasNext()) {
//                System.out.println(iterator.next());
//            }
//        }
//
//        // 2nd way of extracting the set
//        for (Integer num : set) {
//            System.out.println(num);
//        }
//
//        // 3rd way of extracting the set (better way)
//        set.stream().forEach(integer -> {
//            System.out.println(integer);
//        });
//
//        set.forEach(num -> System.out.println(num));
//        // 4th way
//        Spliterator<Integer> spliterator = set.spliterator();
//        spliterator.forEachRemaining(System.out::println);
//
//        set.remove(10);
//        System.out.println("After removing of element '10': " + set);
//
//        set.clear();
//        System.out.println("After clearing the complete set: " + set);
    }
}
