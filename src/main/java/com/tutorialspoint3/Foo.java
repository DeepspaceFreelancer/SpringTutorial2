package com.tutorialspoint3;

import java.util.UUID;

public class Foo {

    String uniqId = UUID.randomUUID().toString();

    public void init() {
        System.out.println("Foo.init " + uniqId);
    }

    public void cleanup() {
        System.out.println("Foo.cleanup " + uniqId);
    }

    public void action() {
        System.out.println("Foo.action " + uniqId);
    }
}
