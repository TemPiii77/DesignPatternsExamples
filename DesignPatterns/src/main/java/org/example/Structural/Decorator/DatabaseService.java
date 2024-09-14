package org.example.Structural.Decorator;

public class DatabaseService {
    public String getPhoneNbrFromUsername(String username) {
        return username + "@Phone";
    }

    public String getFBNameFromUsername(String username) {
        return username + "@Facebook";
    }

    public String getMailFromUsername(String username) {
        return username + "@Mail";
    }
}
