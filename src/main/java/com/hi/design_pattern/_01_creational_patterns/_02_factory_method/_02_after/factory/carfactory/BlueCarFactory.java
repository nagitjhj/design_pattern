package com.hi.design_pattern._01_creational_patterns._02_factory_method._02_after.factory.carfactory;

import com.hi.design_pattern._01_creational_patterns._02_factory_method._02_after.product.Product;
import com.hi.design_pattern._01_creational_patterns._02_factory_method._02_after.product.car.BlueCar;

public class BlueCarFactory implements CarFactory{
    @Override
    public Product createProduct(String name) {
        BlueCar blueCar = new BlueCar();
        blueCar.setName(name);
        blueCar.setColor("Blue");
        blueCar.setLogo("스니폼");
        blueCar.setMoney(200000000);
        return blueCar;
    }
}
