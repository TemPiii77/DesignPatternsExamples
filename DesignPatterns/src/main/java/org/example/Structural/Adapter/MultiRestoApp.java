package org.example.Structural.Adapter;

public class MultiRestoApp implements IMultiRestoApp {
    @Override
    public void displayMenus(String xmlData) {
        System.out.println("XML");

    }

    @Override
    public void displayRecommendations(String xmlData) {
        System.out.println("XML");
    }
}
