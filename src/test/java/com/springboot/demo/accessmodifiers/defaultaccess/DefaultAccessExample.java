package com.springboot.demo.accessmodifiers.defaultaccess;

import com.springboot.demo.accessmodifiers.privateaccess.PrivateAccessExampleExample;

public class DefaultAccessExample {
    static String defaultAccessVariable = "suresh";

    public static void main(String[] args) {
        System.out.println(defaultAccessVariable);
        Test t = new Test();
    }
}

class Test extends DefaultAccessExample {
    Test() {
        System.out.println("accessing default variables in outside class: " + defaultAccessVariable);
    }
}