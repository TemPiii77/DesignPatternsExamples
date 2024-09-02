package org.example.Creational.Singleton;

public class Singleton {

    private static volatile Singleton instance;
    private String data;

    private Singleton(String data) {
        this.data = data;
    }

    public static Singleton getInstance(String data) {
        Singleton result = instance;
        if (result == null) {
            synchronized (Singleton.class) {
                result = instance;
                if (result == null) {
                    instance = result = new Singleton(data);
                }
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "data='" + data + '\'' +
                '}';
    }
}
