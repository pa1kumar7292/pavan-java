package com.springboot.demo.collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap();
        map.put(1, 100);
        map.put(2, 200);
        map.put(3, 300);
        //map.put(4, 300);
        map.put(5, 300);
        map.put(5, 300);
        map.put(null, 88888); // 4th
        map.put(null, 88888); // 5th

        System.out.println("list of key value pairs:" + map);

        System.out.println("map size:" + map.size());

        System.out.println("Getting element using key: " + map.get(1));

        System.out.println("Getting element using key: " + map.get("1"));

        System.out.println("Getting element using key: " + map.get(null));

        System.out.println("checking map is empty or not:" + map.isEmpty());

        System.out.println("put key and value if not present:" + map.putIfAbsent(4,9999));

        System.out.println("after putting element:" + map);

        System.out.println("replace value:" + map.replace(1, 1000));

        System.out.println("after replace:" + map);

        System.out.println("remove:" + map.remove(1, 1000));

        System.out.println("after remove:" + map);

        System.out.println("to get only keys:" + map.keySet());

        System.out.println("to get only values:" + map.values());

        //System.out.println("to get only values:" + map.merge(2, 2000, ));
    }
}
