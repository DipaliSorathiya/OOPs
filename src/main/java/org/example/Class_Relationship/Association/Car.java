package org.example.Class_Relationship.Association;

public class Car {

    String model;
    Car(String model){
        this.model = model;
    }

    void drive(){
        System.out.println("Driving a: "+ model);
    }
}
