package org.example.Creational.FactoryMethod.Product;

public class BeefBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing Beef Burger");
    }
}
