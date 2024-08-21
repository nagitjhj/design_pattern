package com.hi.design_pattern._01_creational_patterns._03_abstract_factory;

import com.hi.design_pattern._01_creational_patterns._03_abstract_factory.factory.ShipFactory;
import com.hi.design_pattern._01_creational_patterns._03_abstract_factory.factory.ShipPartsFactory;
import com.hi.design_pattern._01_creational_patterns._03_abstract_factory.factory.WhiteShipFactory;
import com.hi.design_pattern._01_creational_patterns._03_abstract_factory.factory.WhiteShipPartsFactory;
import com.hi.design_pattern._01_creational_patterns._03_abstract_factory.product.Ship;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class ClientTest {

    @Test
    void 추상팩토리(){
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(ShipConfig.class);
        ShipFactory shipFactory = ac.getBean("shipFactory", ShipFactory.class);
        Ship ship = shipFactory.startOrder("키움질주SHIP");
        System.out.println("ship = " + ship);
    }


    static class ShipConfig{
        @Bean
        public ShipFactory shipFactory(){
            return new WhiteShipFactory(shipPartsFactory());
        }

        @Bean
        public ShipPartsFactory shipPartsFactory(){
            return new WhiteShipPartsFactory();
        }
    }
}
