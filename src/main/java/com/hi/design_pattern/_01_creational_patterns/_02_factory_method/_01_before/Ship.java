package com.hi.design_pattern._01_creational_patterns._02_factory_method._01_before;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ship {
    private String name;
    private String color;
    private String logo;
    private int money;

    @Override
    public String toString() {
        return "Ship{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", logo='" + logo + '\'' +
                ", money=" + money +
                '}';
    }
}
