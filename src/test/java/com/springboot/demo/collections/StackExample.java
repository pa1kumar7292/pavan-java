package com.springboot.demo.collections;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.add(10);
        stack.add(20);
        stack.add(30);

        System.out.println(stack);

        // remove top element from stack
        stack.pop();

        System.out.println("after pop method: " + stack);

        // get and print the top element
        System.out.println(stack.peek());

        // push to top of the stack
        stack.push(30);

        System.out.println(stack);

        // check given element available or not
        System.out.println(stack.contains(10));

        // search and return the position
        System.out.println(stack.search(20));

        // return the current capacity of the stack
        System.out.println(stack.capacity());

    }
}
