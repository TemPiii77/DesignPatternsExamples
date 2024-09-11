package org.example.Behavioral.Strategy;

public class PaymentByPayPal implements PaymentStrategy {
    @Override
    public void collectPaymentDetails() {
        System.out.println("Collect Paypal payment details");
    }

    @Override
    public boolean validatePaymentDetails() {
        return false;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Payment by PayPal");
    }
}
