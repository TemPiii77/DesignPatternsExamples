package org.example.Behavioral.Visitor;

public class Bank extends Client {
    public Bank(String name, String address, String number) {
        super(name, address, number);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitBank(this);
    }
}
