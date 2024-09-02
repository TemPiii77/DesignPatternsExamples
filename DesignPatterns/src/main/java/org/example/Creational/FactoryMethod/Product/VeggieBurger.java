package org.example.Creational.FactoryMethod.Product;

public class VeggieBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing Veggie Burger");
    }
}
