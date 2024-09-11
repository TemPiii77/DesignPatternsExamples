package org.example.Behavioral.State;

public class ReadyState extends State {
    public ReadyState(Phone phone) {
        super(phone);
    }

    @Override
    public void onHome() {
        phone.home();
    }

    @Override
    public void onOffOn() {
        phone.setState(new OffState(phone));
        phone.lock();
    }
}
