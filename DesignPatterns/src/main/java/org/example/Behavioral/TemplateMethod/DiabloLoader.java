package org.example.Behavioral.TemplateMethod;

public class DiabloLoader extends BaseGameLoader {
    @Override
    byte[] loadLocalData() {
        System.out.println("Loading Diablo files...");
        return new byte[0];
    }

    @Override
    void createObjects(byte[] data) {
        System.out.println("Creating Diablo objects...");
    }

    @Override
    void downloadAdditionalFiles() {
        System.out.println("Downloading Diablo sounds...");
    }

    @Override
    void initializeProfiles() {
        System.out.println("Loading Diablo profiles...");
    }
}
