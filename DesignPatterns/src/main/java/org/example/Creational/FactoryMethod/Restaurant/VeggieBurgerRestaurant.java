package org.example.Creational.FactoryMethod.Restaurant;

import org.example.Creational.FactoryMethod.Product.Burger;
import org.example.Creational.FactoryMethod.Product.VeggieBurger;

public class VeggieBurgerRestaurant extends Restaurant {
    @Override
    public Burger createBurger() {
        return new VeggieBurger();
    }
}
