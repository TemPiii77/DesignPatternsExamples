package org.example;

import org.example.Creational.Prototype.VehicleCache;


public class Main {
    public static void main(String[] args) {

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------//

        /*
        Singleton:
            - Only one instance of this class exists
            - Provides a single point of access to it
        */
        /*
        System.out.println(Singleton.getInstance("test"));
        System.out.println(Singleton.getInstance("test2"));
        */

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------//

        /*
        Factory Method:
            - Makes the given code loosely coupled by separating the product’s
              construction code from the code that uses this product
        */
        /*
        Restaurant beefResto = new BeefBurgerRestaurant();
        Burger beefBurger = beefResto.orderBurger();

        Restaurant veggieResto = new VeggieBurgerRestaurant();
        Burger veggieBurger = veggieResto.orderBurger();
        */

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------//

        /*
        Abstract Factory:
            - Allows you to produce families of related objects
              without specifying their concrete classes
        */
        /*
        Company msi = new MsiManufacturer();
        Gpu msiGpu = msi.createGpu();
        Monitor msiMonitor = msi.createMonitor();

        Company asus = new AsusManufacturer();
        Gpu asusGpu = asus.createGpu();
        Monitor asusMonitor = asus.createMonitor();
        */

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------//

        /*
        Builder:
            - Produces different types and representations of an object
              using the same construction process
        */
        /*
        CarBuilder builder = new CarBuilder();
        builder.id(2122)
                .brand("Bugatti")
                .model("Chiron")
                .color("Blue");
        Car car = builder.build();
        System.out.println(car);

        Director director = new Director();
        CarBuilder carBuilder2 = new CarBuilder();
        director.buildLambo(carBuilder2);
        Car car2 = carBuilder2.build();
        System.out.println(car2);
        */

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------//

        /*
        Prototype:
            - Delegates the object duplication or cloning process
              to the actual objects that are being cloned
        */
        /*
        VehicleCache cache = new VehicleCache();
        System.out.println(cache.get("Bugatti Chiron"));
        */

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------//









    }
}