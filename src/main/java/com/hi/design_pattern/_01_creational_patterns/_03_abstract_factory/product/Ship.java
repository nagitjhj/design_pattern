package com.hi.design_pattern._01_creational_patterns._03_abstract_factory.product;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ship {
    private String name;
    private String color;
    private Long price;

    private Wheel wheel;
    private Anchor anchor;

    @Override
    public String toString() {
        return "Ship{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", wheel=" + wheel +
                ", anchor=" + anchor +
                '}';
    }
}
