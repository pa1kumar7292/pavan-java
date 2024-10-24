package com.springboot.demo.accessmodifiers.privateaccess;

import com.springboot.demo.accessmodifiers.publicaccess.PublicAccessExample;

public class PrivateAccessExampleExample extends PublicAccessExample {
    private static String privateVariable = "kumar private";
    public static void main(String[] args) {
        System.out.println(publicVariable);
        System.out.println(privateVariable);

    }
}

class Test extends PrivateAccessExampleExample {
    Test() {
        //System.out.println(privateVariable);
    }
}
