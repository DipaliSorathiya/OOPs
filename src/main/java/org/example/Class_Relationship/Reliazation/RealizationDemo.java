package org.example.Class_Relationship.Reliazation;

public class RealizationDemo {

    public static void main(String[] args) {
        Payment payment1 = new CreditCardPayment();
        Payment payment2 = new CashPayment();

        payment1.pay();
        payment2.pay();
    }
}
