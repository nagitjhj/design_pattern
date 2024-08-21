package com.hi.design_pattern._01_creational_patterns._03_abstract_factory.factory;

import com.hi.design_pattern._01_creational_patterns._03_abstract_factory.product.Ship;

public interface ShipFactory {

    default Ship startOrder(String name){
        Ship ship = createShip(name);
//        ship.setName(name);
//        ship.setAnchor(new WhiteAnchor());
//        ship.setWheel(new WhiteWheel());
        return ship;
    }

    public Ship createShip(String name);


}
