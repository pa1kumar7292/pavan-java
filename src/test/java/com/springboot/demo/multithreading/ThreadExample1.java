package com.springboot.demo.multithreading;

public class ThreadExample1 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        MyThread myThread1 = new MyThread();

        myThread1.start();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("thread running...");

    }
}
