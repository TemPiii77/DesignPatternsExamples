package org.example.Creational.FactoryMethod.Restaurant;

import org.example.Creational.FactoryMethod.Product.Burger;

public abstract class Restaurant {
    public Burger orderBurger() {
        Burger burger = createBurger();
        burger.prepare();
        return burger;
    }

    public abstract Burger createBurger();
}
