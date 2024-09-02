package org.example.Creational.FactoryMethod.Restaurant;

import org.example.Creational.FactoryMethod.Product.Burger;
import org.example.Creational.FactoryMethod.Product.BeefBurger;

public class BeefBurgerRestaurant extends Restaurant {
    @Override
    public Burger createBurger() {
        return new BeefBurger();
    }
}
