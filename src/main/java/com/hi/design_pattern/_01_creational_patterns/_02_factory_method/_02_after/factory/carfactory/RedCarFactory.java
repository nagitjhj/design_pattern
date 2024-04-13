package com.hi.design_pattern._01_creational_patterns._02_factory_method._02_after.factory.carfactory;

import com.hi.design_pattern._01_creational_patterns._02_factory_method._02_after.product.Product;
import com.hi.design_pattern._01_creational_patterns._02_factory_method._02_after.product.car.RedCar;

public class RedCarFactory implements CarFactory{
    @Override
    public Product createProduct(String name) {
        RedCar redCar = new RedCar();
        redCar.setName(name);
        redCar.setColor("Red");
        redCar.setLogo("버건디레볼루션");
        redCar.setMoney(500000000);
        return redCar;
    }
}
