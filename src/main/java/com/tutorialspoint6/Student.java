package com.tutorialspoint6;

public class Student {
    private Integer age;
    private String name;

    public Student() {
        age = new Integer(1);
        name = "Default";
    }

    public Integer getAge() {
        System.out.println("Age : " + age);
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        System.out.println("Name : " + name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printThrowException() {
        System.out.println("Exception raised");
        throw new IllegalArgumentException();
    }
}