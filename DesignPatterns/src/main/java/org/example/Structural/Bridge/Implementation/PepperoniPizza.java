package org.example.Structural.Bridge.Implementation;

public class PepperoniPizza extends Pizza {
    public PepperoniPizza() {
    }

    public PepperoniPizza(String sauce, String[] toppings, String crust) {
        super(sauce, toppings, crust);
    }

    @Override
    public void assemble() {
        System.out.println("Pepperoni Pizza assemble");
    }

    @Override
    public void qualityCheck() {
        System.out.println("Pepperoni Pizza quality check");
    }
}
