package com.springboot.demo.accessmodifiers.protectedaccess;

import com.springboot.demo.accessmodifiers.privateaccess.PrivateAccessExampleExample;

public class ProtectedAccessExample extends PrivateAccessExampleExample {
    protected static String protectedVariable = "mahesh protected";
    public static void main(String[] args) {
        System.out.println(protectedVariable);
        Test t = new Test();
        //System.out.println(privateVariable);
    }
}

class Test extends ProtectedAccessExample {
    static {
        System.out.println("accessing protected variables in outside class: " + protectedVariable);
    }
}
