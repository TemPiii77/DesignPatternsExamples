package org.example;

import org.example.Behavioral.ChainOfResponsibility.*;
import org.example.Behavioral.Command.Light;
import org.example.Behavioral.Command.Room;
import org.example.Behavioral.Command.SwitchLightsCommand;
import org.example.Behavioral.TemplateMethod.BaseGameLoader;
import org.example.Behavioral.TemplateMethod.DiabloLoader;
import org.example.Behavioral.TemplateMethod.WorldOfWarcraftLoader;
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

        /*
        Chain of Responsibility:
            - Transforms particular behaviors into stand-alone objects called handlers
        */
        /*Database database = new Database();
        Handler handler = new UserExistsHandler(database);
        handler.setNextHandler(new ValidPasswordHandler(database));
        handler.setNextHandler(new RoleCheckHandler());
        AuthService service = new AuthService(handler);
        service.logIn("asd","");
        */

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------//

        /*
        Command:
            - Turns a request or a behavior into a stand-alone object
              that contains everything about request
        */
        /*
        Room room = new Room();
        room.setCommand(new SwitchLightsCommand(new Light()));
        room.executeCommand();
        room.executeCommand();
        room.executeCommand();
        room.executeCommand();
        */

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------//

        /*
        Template Method:
            - Defines the skeleton of an algorithm in the superclass but let’s subclasses
              override specific steps of the algorithm without changing its structure
        */
        /*
        BaseGameLoader loader = new WorldOfWarcraftLoader();
        loader.load();
        loader = new DiabloLoader();
        loader.load();
        */

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------//












//--------------------------------------------------------------------------------------------------------------------------------------------------------------------//


    }
}