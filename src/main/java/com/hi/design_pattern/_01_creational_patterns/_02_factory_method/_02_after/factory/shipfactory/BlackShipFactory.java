package com.hi.design_pattern._01_creational_patterns._02_factory_method._02_after.factory.shipfactory;

import com.hi.design_pattern._01_creational_patterns._02_factory_method._02_after.product.Product;
import com.hi.design_pattern._01_creational_patterns._02_factory_method._02_after.product.ship.BlackShip;

public class BlackShipFactory implements ShipFactory{
    @Override
    public Product createProduct(String name) {
        BlackShip blackShip = new BlackShip();
        blackShip.setName(name);
        blackShip.setColor("Black");
        blackShip.setLogo("1짱키움");
        blackShip.setMoney(2000000000);
        return blackShip;
    }
}
