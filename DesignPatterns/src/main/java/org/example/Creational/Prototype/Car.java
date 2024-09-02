package org.example.Creational.Prototype;

public class Car extends Vehicle {
    public int topSpeed;

    public Car() { }

    public Car(Car car) {
        super(car);
        this.topSpeed = car.topSpeed;
    }

    @Override
    public Vehicle clone() {
        return new Car(this);
    }

    @Override
    public String toString() {
        return "Car{" +
                "topSpeed=" + topSpeed +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
