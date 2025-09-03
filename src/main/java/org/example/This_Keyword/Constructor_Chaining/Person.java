package org.example.This_Keyword.Constructor_Chaining;

public class Person {

    private String name;
    private int age;

    Person(String name){
        this(name,0);
    }

    Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: "+name + ", Age: "+age);
    }
}
