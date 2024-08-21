package com.hi.design_pattern._01_creational_patterns._03_abstract_factory.factory;

import com.hi.design_pattern._01_creational_patterns._03_abstract_factory.product.Ship;
import com.hi.design_pattern._01_creational_patterns._03_abstract_factory.product.WhiteShip;
import org.springframework.stereotype.Component;


public class WhiteShipFactory implements ShipFactory{
    private final ShipPartsFactory shipPartsFactory;

    public WhiteShipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip(String name) {
        Ship ship = new WhiteShip();
        ship.setName(name);
        ship.setWheel(shipPartsFactory.createWheel());
        ship.setAnchor(shipPartsFactory.createAnchor());
        return ship;
    }
}
