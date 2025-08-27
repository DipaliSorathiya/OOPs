package org.example.Class_Relationship.Association;

public class Person {

    String name;
    Car car;

    Person(String name,Car car){
        this.name = name;
        // Association :
        this.car = car;
    }

    void goForDrive() {
        System.out.println(name + " is going for a drive..");
        car.drive();
    }
}
