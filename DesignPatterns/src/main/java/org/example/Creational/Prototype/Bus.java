package org.example.Creational.Prototype;

public class Bus extends Vehicle {
    public int doors;

    public Bus() { }

    public Bus(Bus bus) {
        super(bus);
        this.doors = bus.doors;
    }

    @Override
    public Vehicle clone() {
        return new Bus(this);
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "doors=" + doors +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
