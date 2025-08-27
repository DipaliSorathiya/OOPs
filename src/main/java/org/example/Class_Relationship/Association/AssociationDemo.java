package org.example.Class_Relationship.Association;

public class AssociationDemo {

    public static void main(String[] args){
        Car car = new Car("Tesla Model 3");
        Person person = new Person("Alice",car);
        person.goForDrive();
    }
}
