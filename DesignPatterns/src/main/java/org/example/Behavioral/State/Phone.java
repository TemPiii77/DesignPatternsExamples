package org.example.Behavioral.State;

public class Phone {
    public State state;

    public Phone() {
        state = new OffState(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public void lock() {
        System.out.println("Lock");
    }

    public void home() {
        System.out.println("Home");
    }

    public void unlock() {
        System.out.println("Unlock");
    }

    public void turnOn() {
        System.out.println("Turn On");
    }
}
