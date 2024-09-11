package org.example.Behavioral.Strategy;

public class PaymentByCreditCard implements PaymentStrategy {
    @Override
    public void collectPaymentDetails() {
        System.out.println("Collect Credit Card payment details");
    }

    @Override
    public boolean validatePaymentDetails() {
        return false;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Payment by credit card");
    }
}
