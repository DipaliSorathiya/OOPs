package org.example.IntroToClassesAndObjects;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota","Corolla",2021);
        Car car2 = new Car("Honda","Civic",2022);

        car1.startEngine();
        car2.startEngine();
        car1.displayInfo();
        car2.displayInfo();
    }
}
