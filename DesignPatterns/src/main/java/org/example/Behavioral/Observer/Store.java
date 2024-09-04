package org.example.Behavioral.Observer;

public class Store {
    private final NotificationService notificationService = new NotificationService();

    public Store() {}

    public void newItemPromotion() {
        notificationService.notifyCustomers();
    }

    public NotificationService getNotificationService() {
        return notificationService;
    }
}
