package org.example.Structural.Bridge.Abstraction;

import org.example.Structural.Bridge.Implementation.Pizza;

public class AmericanRestaurant extends Restaurant {
    public AmericanRestaurant(Pizza pizza) {
        super(pizza);
    }

    @Override
    void addSauce() {
        System.out.println("American Sauce");
    }

    @Override
    void addToppings() {
        System.out.println("American Toppings");
    }

    @Override
    void makeCrust() {
        System.out.println("American Crust");
    }
}
