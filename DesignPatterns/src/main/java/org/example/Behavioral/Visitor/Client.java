package org.example.Behavioral.Visitor;

public abstract class Client {

    public final String name;
    public final String address;
    public final String number;

    public abstract void accept(Visitor visitor);

    public Client(String name, String address, String number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getNumber() {
        return number;
    }
}
