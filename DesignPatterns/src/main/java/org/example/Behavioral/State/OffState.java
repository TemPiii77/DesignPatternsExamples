package org.example.Behavioral.State;

public class OffState extends State {
    public OffState(Phone phone) {
        super(phone);
    }

    @Override
    public void onHome() {
        phone.setState(new LockedState(phone));
        phone.turnOn();
    }

    @Override
    public void onOffOn() {
        phone.setState(new LockedState(phone));
        phone.turnOn();
    }
}
