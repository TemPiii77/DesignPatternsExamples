package org.example.Structural.Bridge.Abstraction;

import org.example.Structural.Bridge.Implementation.Pizza;

public class ItalianRestaurant extends Restaurant {
    public ItalianRestaurant(Pizza pizza) {
        super(pizza);
    }

    @Override
    void addSauce() {
        System.out.println("Italian Sauce");
    }

    @Override
    void addToppings() {
        System.out.println("Italian Toppings");
    }

    @Override
    void makeCrust() {
        System.out.println("Italian Crust");
    }
}
