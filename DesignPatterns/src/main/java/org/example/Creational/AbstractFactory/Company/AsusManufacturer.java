package org.example.Creational.AbstractFactory.Company;

import org.example.Creational.AbstractFactory.Product.AsusGpu;
import org.example.Creational.AbstractFactory.Product.AsusMonitor;
import org.example.Creational.AbstractFactory.Product.Gpu;
import org.example.Creational.AbstractFactory.Product.Monitor;

public class AsusManufacturer extends Company {
    @Override
    public Gpu createGpu() {
        System.out.println("Creating AsusGpu");
        return new AsusGpu();
    }

    @Override
    public Monitor createMonitor() {
        System.out.println("Creating AsusMonitor");
        return new AsusMonitor();
    }
}
