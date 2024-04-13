package com.hi.design_pattern._01_creational_patterns._02_factory_method._02_after.factory.shipfactory;

import com.hi.design_pattern._01_creational_patterns._02_factory_method._02_after.product.Product;
import com.hi.design_pattern._01_creational_patterns._02_factory_method._02_after.product.ship.WhiteShip;

public class WhiteShipFactory implements ShipFactory {
    @Override
    public Product createProduct(String name) {
        WhiteShip whiteShip = new WhiteShip();
        whiteShip.setName(name);
        whiteShip.setColor("White");
        whiteShip.setLogo("1짱히어로즈");
        whiteShip.setMoney(1000000000);
        return whiteShip;
    }
}
