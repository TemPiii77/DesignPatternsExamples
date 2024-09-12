package org.example.Structural.Bridge.Implementation;

public class VeggiePizza extends Pizza {

    public VeggiePizza() {
    }

    public VeggiePizza(String sauce, String[] toppings, String crust) {
        super(sauce, toppings, crust);
    }

    @Override
    public void assemble() {
        System.out.println("Veggie Pizza assemble");
    }

    @Override
    public void qualityCheck() {
        System.out.println("Veggie Pizza quality check");
    }
}
