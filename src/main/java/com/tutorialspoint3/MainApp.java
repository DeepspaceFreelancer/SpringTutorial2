package com.tutorialspoint3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AbstractApplicationContext ctx =
                new AnnotationConfigApplicationContext(HelloWorldConfig.class, TextEditorConfig.class,
                        FooConfig.class, ConfigA.class, ConfigB.class);

        HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
        helloWorld.setMessage("Hello World!");
        helloWorld.getMessage();

        TextEditor te = ctx.getBean(TextEditor.class);
        te.spellCheck();

        // now both beans A and B will be available...
        A a = ctx.getBean(A.class);
        B b = ctx.getBean(B.class);

        System.out.println("Before all Foo's");
        Foo fo1 = ctx.getBean(Foo.class);
        fo1.action();
        Foo fo2 = ctx.getBean(Foo.class);
        fo2.action();

        ctx.registerShutdownHook();
    }
}