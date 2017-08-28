package com.tutorialspoint4;

import org.springframework.context.ApplicationListener;

import java.util.UUID;

public class CustomEventHandler implements ApplicationListener<CustomEvent> {

    String uuid = UUID.randomUUID().toString();

    public void onApplicationEvent(CustomEvent event) {
        System.out.println("CustomEventHandler.onApplicationEvent " + uuid);
        System.out.println(event.toString());
    }
}