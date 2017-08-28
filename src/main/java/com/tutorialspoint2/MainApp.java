package com.tutorialspoint2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans2.xml");
        TextEditor te = (TextEditor) context.getBean("textEditor");
        te.spellCheck();

        TextEditor2 te2 = (TextEditor2) context.getBean("textEditor2");
        te.spellCheck();

        Profile profile = (Profile) context.getBean("profile");
        profile.printAge();
        profile.printName();

        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage();
        context.registerShutdownHook();
    }
}