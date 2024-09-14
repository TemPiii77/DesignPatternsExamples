package org.example;

import org.example.Behavioral.ChainOfResponsibility.*;
import org.example.Behavioral.Command.Light;
import org.example.Behavioral.Command.Room;
import org.example.Behavioral.Command.SwitchLightsCommand;
import org.example.Behavioral.Memento.Editor;
import org.example.Behavioral.Observer.EmailMsgListener;
import org.example.Behavioral.Observer.MobileAppListener;
import org.example.Behavioral.State.Phone;
import org.example.Behavioral.Strategy.PaymentByCreditCard;
import org.example.Behavioral.Strategy.PaymentByPayPal;
import org.example.Behavioral.Strategy.PaymentService;
import org.example.Behavioral.TemplateMethod.BaseGameLoader;
import org.example.Behavioral.TemplateMethod.DiabloLoader;
import org.example.Behavioral.TemplateMethod.WorldOfWarcraftLoader;
import org.example.Behavioral.Visitor.*;
import org.example.Creational.Prototype.VehicleCache;
import org.example.Structural.Adapter.FancyUIService;
import org.example.Structural.Adapter.FancyUIServiceAdapter;
import org.example.Structural.Adapter.IMultiRestoApp;
import org.example.Structural.Adapter.MultiRestoApp;
import org.example.Structural.Bridge.Abstraction.AmericanRestaurant;
import org.example.Structural.Bridge.Abstraction.ItalianRestaurant;
import org.example.Structural.Bridge.Implementation.PepperoniPizza;
import org.example.Structural.Bridge.Implementation.VeggiePizza;
import org.example.Structural.Composite.Book;
import org.example.Structural.Composite.CompositeBox;
import org.example.Structural.Composite.DeliveryService;
import org.example.Structural.Composite.VideoGame;
import org.example.Structural.Decorator.FacebookDecorator;
import org.example.Structural.Decorator.INotifier;
import org.example.Structural.Decorator.Notifier;
import org.example.Structural.Decorator.WhatsAppDecorator;
import org.example.Structural.Facade.NotifierFacade;
import org.example.Structural.Flyweight.Store;
import org.example.Structural.Proxy.ProxyVideoDownloader;
import org.example.Structural.Proxy.VideoDownloader;

import java.lang.management.MemoryUsage;
import java.util.ArrayList;
import java.util.List;


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

        /*
        Mediator:
            - Defines an object that encapsulates how a set of other objects interact with one another
            - Restricts direct communications between objects and forces them to collaborate
              via a mediator, hence reducing the dependencies between them
        */

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------//

        /*
        Memento:
            - Delegates creating the state snapshots to the actual owner of that state
        */
        /*
        Editor editor = new Editor();
        editor.write("Like");
        editor.write("Like and");
        editor.write("Like and Subscribe");
        editor.undo();
        */


//--------------------------------------------------------------------------------------------------------------------------------------------------------------------//

        /*
        Observer:
            - Notifies multiple objects, or subscribers, about any events that happen
              to the object they’re observing, or publisher
        */
        /*
        Store store = new Store();
        store.getNotificationService().subscribe(new EmailMsgListener("a"));
        store.getNotificationService().subscribe(new EmailMsgListener("b"));
        store.getNotificationService().subscribe(new MobileAppListener("c"));
        store.newItemPromotion();
        */

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------//

        /*
        State:
            - Allows an object alter its behavior when its internal state changes
        */
        /*
        Phone phone = new Phone();
        phone.state.onHome();
        phone.state.onOffOn();
        phone.state.onOffOn();
        phone.state.onHome();
        */

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------//

        /*
        Strategy:
            - Defines a family of algorithms, puts each of them in a separate class, and
              makes their objects interchangeable
        */
        /*
        PaymentService paymentService = new PaymentService();
        paymentService.setStrategy(new PaymentByCreditCard());
        paymentService.processOrder();
        paymentService.setStrategy(new PaymentByPayPal());
        paymentService.processOrder();
        */

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------//

        /*
        Iterator:
            - Extracts the traversal behavior of a collection into a separate object called an iterator
            - Traverses the elements of a collection without exposing its underlying representation
        */


//--------------------------------------------------------------------------------------------------------------------------------------------------------------------//

        /*
        Visitor:
            - Separates the algorithms or behaviors from the objects on which they operate
        */
        /*
        List<Client> clients = new ArrayList<Client>();
        clients.add(new Restaurant("a", "a", "10"));
        clients.add(new Bank("b", "b", "20"));
        clients.add(new Resident("c", "c", "30"));

        InsuranceMessagingVisitor insuranceMessagingVisitor = new InsuranceMessagingVisitor();
        insuranceMessagingVisitor.sendInsuranceMails(clients);
        */

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------//

        /*
        Adapter:
            - Allows objects with incompatible interfaces to collaborate with one another
        */
        /*
        IMultiRestoApp multiRestoApp = new MultiRestoApp();
        multiRestoApp.displayMenus("XML");

        FancyUIServiceAdapter adapter = new FancyUIServiceAdapter(new FancyUIService());
        adapter.displayMenus("XML");
        */

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------//

        /*
        Bridge:
            - Splits a large class into two separate hierarchies which can de developed independently
        */
        /*
        AmericanRestaurant americanRestaurant = new AmericanRestaurant(new PepperoniPizza());
        americanRestaurant.deliver();

        ItalianRestaurant italianRestaurant = new ItalianRestaurant(new VeggiePizza());
        italianRestaurant.deliver();
        */

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------//

        /*
        Composite:
            - Composes objects into tree structures and then work with these structures as
              if they were individual objects
        */
        /*
        DeliveryService deliveryService = new DeliveryService();

        deliveryService.setupOrder(
                new CompositeBox(
                        new VideoGame("1", 100)
                ),
                new CompositeBox(
                        new CompositeBox(
                                new Book("2", 200),
                                new Book("3", 300)
                        ),
                        new VideoGame("4", 400),
                        new VideoGame("5", 500)
                )
        );

        deliveryService.calculateOrderPrice();
        */

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------//

        /*
        Decorator:
            - Attach new behaviors to an object by placing this object inside a
              special wrapper that contains these behaviors
        */
        /*
        INotifier notifier = new FacebookDecorator(
                new WhatsAppDecorator(
                        new Notifier("John")
                )
        );
        notifier.send("Test text");
        */

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------//

        /*
        Facade:
            - Provides a simplified interface to a library, a framework, or any
              other complex set of classes
        */
        /*
        NotifierFacade notifier = new NotifierFacade();
        notifier.sendNotification("John", "Test");
        */

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------//

        /*
        Flyweight:
            - Fit more objects into the available RAM by sharing common parts of state between multiple objects,
              instead of storing all of the data in each object individually
        */
        /*
        final int BOOK_TYPES = 2;
        final int BOOKS_TO_INSERT = 10_000_000;

        Store store = new Store();
        for (int i = 0; i < BOOKS_TO_INSERT / BOOK_TYPES; i++) {
            store.storeBook(Long.toString(Math.round(Math.random() * 1000)), 1000, "Action", "Follett", "Stuff");
            store.storeBook(Long.toString(Math.round(Math.random() * 1000)), 1000, "Fantasy", "Ingram", "Extra");
        }
        store.displayBooks();
        */

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------//

        /*
        Proxy:
            - Provides a substitute for another object and controls access to that object,
              allowing you to perform something before or after the request reaches the original object
        */
        /*
        VideoDownloader videoDownloader = new ProxyVideoDownloader();
        videoDownloader.getVideo("geekific");
        videoDownloader.getVideo("geekific");
        videoDownloader.getVideo("likeNsub");
        videoDownloader.getVideo("likeNsub");
        videoDownloader.getVideo("geekific");
        */

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------//
    }
}