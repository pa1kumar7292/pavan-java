package com.springboot.demo.arrays;

public class ArraysExample {

    public static void main(String[] args) {
        // creating, initialising an array and storing the elements
        Integer[] s = new Integer[10];
        s[0] = 10;
        s[1] = 20;
        s[2] = 30;
        s[3] = 40;
        s[4] = 50;
        s[5] = 60;
        s[6] = 70;

        System.out.println(s);

        // iterating an array to print the elements
        for(int i =0; i<s.length;i++) {
            System.out.println(s[i]);
        }

        Integer s2[] = new Integer[]{1,2,3,4,5};

        for(int i =0; i<s2.length;i++) {
            System.out.println(s2[i]);
        }

    }
}
