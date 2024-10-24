package com.springboot.demo.collections;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // its synchronized and thread safe
        Vector<Integer> vector = new Vector();

        vector.add(10);
        vector.add(20);

        System.out.println(vector);
    }
}
