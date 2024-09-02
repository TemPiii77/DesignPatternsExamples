package org.example.Creational.AbstractFactory.Company;

import org.example.Creational.AbstractFactory.Product.Gpu;
import org.example.Creational.AbstractFactory.Product.Monitor;
import org.example.Creational.AbstractFactory.Product.MsiGpu;
import org.example.Creational.AbstractFactory.Product.MsiMonitor;

public class MsiManufacturer extends Company {
    @Override
    public Gpu createGpu() {
        System.out.println("Creating MsiGpu");
        return new MsiGpu();
    }

    @Override
    public Monitor createMonitor() {
        System.out.println("Creating MsiMonitor");
        return new MsiMonitor();
    }
}
