package org.example.Generics_and_WildCards.Generic;

public class Generic_Class<T> {

    T obj;
    Generic_Class(T obj) {
        this.obj = obj;
    }
    public T getObject() {
        return this.obj;
    }
}

class Main {
    public static void main(String[] args) {

        // instance of Integer type.
        Generic_Class<Integer> iObj = new Generic_Class<Integer>(15);
        System.out.println(iObj.getObject());

        // instance of String type
        Generic_Class<String> sObj = new Generic_Class<>("Dipali");
        System.out.println(sObj.getObject());
    }
}
