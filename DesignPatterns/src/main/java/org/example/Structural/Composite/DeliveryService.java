package org.example.Structural.Composite;

public class DeliveryService {
    private Box box;

    public DeliveryService() {
    }

    public void setupOrder(Box... boxes) {
        this.box = new CompositeBox(boxes);
    }

    public void calculateOrderPrice() {
        System.out.println(box.calculatePrice());
    }
}
