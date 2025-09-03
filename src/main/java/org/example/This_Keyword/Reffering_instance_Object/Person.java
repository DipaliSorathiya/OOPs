package org.example.This_Keyword.Reffering_instance_Object;

public class Person {

    private String name;

    Person(String name){
        this.name = name;
    }
    void display() {
        System.out.println("Name: "+this.name);
    }
}
