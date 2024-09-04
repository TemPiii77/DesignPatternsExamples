package org.example.Behavioral.Observer;

public class MobileAppListener implements EventListener {
    private final String username;

    public MobileAppListener(String username) {
        this.username = username;
    }

    @Override
    public void update() {
        System.out.println("Username: " + username);
    }
}
