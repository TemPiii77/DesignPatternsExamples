package org.example.Behavioral.Command;

public class Light {
    private boolean switchedOn;

    public void switchLights() {
        switchedOn = !switchedOn;
        System.out.println(switchedOn);
    }
}
