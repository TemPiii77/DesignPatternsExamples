package org.example.Creational.AbstractFactory.Company;

import org.example.Creational.AbstractFactory.Product.Gpu;
import org.example.Creational.AbstractFactory.Product.Monitor;

public abstract class Company {

    public abstract Gpu createGpu();

    public abstract Monitor createMonitor();
}
