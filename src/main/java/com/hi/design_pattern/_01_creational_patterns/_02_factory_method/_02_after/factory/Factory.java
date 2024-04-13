package com.hi.design_pattern._01_creational_patterns._02_factory_method._02_after.factory;

import com.hi.design_pattern._01_creational_patterns._02_factory_method._02_after.product.Product;

public interface Factory {

    default Product order(String name){
        validate(name);
        startMessage(name);
        Product product = createProduct(name);
        completeMessage(name);
        System.out.println(product.toString());
        return product;
    }

    Product createProduct(String name);

    private void validate(String name){
        if(name == null || name.isBlank())
            throw new RuntimeException("name 입력 안하면 못만들어요");
    }

    private void startMessage(String name){
        System.out.println("만들기 시작합니다 기다리세요 -> " + name);
    }

    private void completeMessage(String name){
        System.out.println("다 만들었어요 배송해줄게요 ~ " + name);
    }
}
