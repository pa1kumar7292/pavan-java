package com.springboot.demo.collections;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // follow natural order
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(10);
        priorityQueue.add(50);
        priorityQueue.add(30);
        priorityQueue.add(20);
        priorityQueue.add(5);

        System.out.println(priorityQueue);

        // get the head of the queue
        System.out.println(priorityQueue.peek());

        // get and remove the head of the queue, if the queue is empty then throw an exception
        System.out.println(priorityQueue.remove());

        System.out.println(priorityQueue);

        // same as peek but if the queue is empty it will return null
        System.out.println(priorityQueue.poll());

        System.out.println(priorityQueue);


    }
}
