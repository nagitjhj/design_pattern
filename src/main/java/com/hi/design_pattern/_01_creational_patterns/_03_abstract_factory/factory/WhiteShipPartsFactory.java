package com.hi.design_pattern._01_creational_patterns._03_abstract_factory.factory;

import com.hi.design_pattern._01_creational_patterns._03_abstract_factory.product.Anchor;
import com.hi.design_pattern._01_creational_patterns._03_abstract_factory.product.Wheel;
import com.hi.design_pattern._01_creational_patterns._03_abstract_factory.product.WhiteAnchor;
import com.hi.design_pattern._01_creational_patterns._03_abstract_factory.product.WhiteWheel;
import org.springframework.stereotype.Component;


public class WhiteShipPartsFactory implements ShipPartsFactory{
    @Override
    public Wheel createWheel() {
        return new WhiteWheel();
    }

    @Override
    public Anchor createAnchor() {
        return new WhiteAnchor();
    }
}
