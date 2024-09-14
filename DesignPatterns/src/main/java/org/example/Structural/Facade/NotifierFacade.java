package org.example.Structural.Facade;

import org.example.Structural.Decorator.FacebookDecorator;
import org.example.Structural.Decorator.INotifier;
import org.example.Structural.Decorator.Notifier;
import org.example.Structural.Decorator.WhatsAppDecorator;

public class NotifierFacade {

    public void sendNotification(String name, String message) {
        INotifier notifier = new FacebookDecorator(
                new WhatsAppDecorator(
                        new Notifier(name)
                )
        );
        notifier.send(message);
    }
}
