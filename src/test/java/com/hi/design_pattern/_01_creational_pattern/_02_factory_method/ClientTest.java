package com.hi.design_pattern._01_creational_pattern._02_factory_method;

import com.hi.design_pattern._01_creational_patterns._02_factory_method._02_after.factory.Factory;
import com.hi.design_pattern._01_creational_patterns._02_factory_method._02_after.factory.carfactory.BlueCarFactory;
import com.hi.design_pattern._01_creational_patterns._02_factory_method._02_after.factory.carfactory.RedCarFactory;
import com.hi.design_pattern._01_creational_patterns._02_factory_method._02_after.factory.shipfactory.BlackShipFactory;
import com.hi.design_pattern._01_creational_patterns._02_factory_method._02_after.factory.shipfactory.WhiteShipFactory;
import com.hi.design_pattern._01_creational_patterns._02_factory_method._02_after.product.Product;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class ClientTest {
    @Test
    void 배사러온_고객(){
        String name = "whiteship".toLowerCase();
        Product product = null;
        switch (name){
            case "bluecar":
                product = order(new BlueCarFactory(), name);
                break;
            case "redcar":
                product = order(new RedCarFactory(), name);
                break;
            case "whiteship":
                product = order(new WhiteShipFactory(), name);
                break;
            case "blackship":
                product = order(new BlackShipFactory(), name);
                break;
        }

        assertThat(product.getName()).isSameAs("whiteship");
    }

    private Product order(Factory factory, String name){
        return factory.order(name);
    }
}
