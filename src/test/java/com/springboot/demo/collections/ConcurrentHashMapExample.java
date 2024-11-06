package com.springboot.demo.collections;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {

    public static void main(String[] args) {
        // try to run with HashMap multiple times you will get concurrent modification exception.
        //HashMap<Integer, String> map = new HashMap<>();
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

        // Thread to add elements to the map
        Thread thread1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                map.put(i, "Value " + i);
                System.out.println("Thread 1 added: " + i);
                try {
                    Thread.sleep(50); // Simulate some delay
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Thread to iterate over the map and print elements
        Thread thread2 = new Thread(() -> {
            try {
                Thread.sleep(100); // Ensure some elements are added before iterating
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Thread 2 iterating over the map:");
            map.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
        });

        // Start both threads
        thread1.start();
        thread2.start();

        // Wait for both threads to complete
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Map: " + map);
    }

}
