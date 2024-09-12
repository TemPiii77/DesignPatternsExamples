package org.example.Structural.Adapter;

public class FancyUIServiceAdapter implements IMultiRestoApp {
    private final FancyUIService fancyUIService;

    public FancyUIServiceAdapter(FancyUIService fancyUIService) {
        this.fancyUIService = fancyUIService;
    }

    @Override
    public void displayMenus(String xmlData) {
        // Convert and display
        System.out.println("XML");
    }

    @Override
    public void displayRecommendations(String xmlData) {
        // Convert and display
        System.out.println("XML");
    }

    private void convertXmlToJson(String xmlData) {
        // Convert XmlData to JsonData and return it
    }
}
