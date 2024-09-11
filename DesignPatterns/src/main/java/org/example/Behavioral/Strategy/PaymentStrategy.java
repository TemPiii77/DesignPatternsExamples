package org.example.Behavioral.Strategy;

public interface PaymentStrategy {
    void collectPaymentDetails();
    boolean validatePaymentDetails();
    void pay(int amount);
}
