package org.example.Class_Relationship.Reliazation;

public class CashPayment implements  Payment{

    @Override
    public void pay() {
        System.out.println("Paid using cash!!");
    }
}
