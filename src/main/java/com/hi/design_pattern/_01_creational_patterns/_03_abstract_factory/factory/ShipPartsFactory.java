package com.hi.design_pattern._01_creational_patterns._03_abstract_factory.factory;

import com.hi.design_pattern._01_creational_patterns._03_abstract_factory.product.Anchor;
import com.hi.design_pattern._01_creational_patterns._03_abstract_factory.product.Wheel;

public interface ShipPartsFactory {
    Wheel createWheel();
    Anchor createAnchor();
}
