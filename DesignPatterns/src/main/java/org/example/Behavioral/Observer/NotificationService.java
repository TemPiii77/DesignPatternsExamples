package org.example.Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {
    private final List<EventListener> customers;

    public NotificationService() {
        this.customers = new ArrayList<EventListener>();
    }

    public void subscribe(EventListener listener) {
        customers.add(listener);
    }

    public void unsubscribe(EventListener listener) {
        customers.remove(listener);
    }

    public void notifyCustomers() {
        customers.forEach(listener -> listener.update());
    }
}
