package com.tutorialspoint3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class FooConfig {

    @Bean(initMethod = "init", destroyMethod = "cleanup")
    @Scope("singleton")
    public Foo foo() {
        return new Foo();
    }
}
