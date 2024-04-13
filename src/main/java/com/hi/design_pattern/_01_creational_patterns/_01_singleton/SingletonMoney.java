package com.hi.design_pattern._01_creational_patterns._01_singleton;

public class SingletonMoney {
    private int money;

    private SingletonMoney(){
        this.money = 30000;
    }

    private static class SingletonHolder{
        private static final SingletonMoney INSTANCE = new SingletonMoney();
    }

    public static SingletonMoney getInstance(){
        return SingletonHolder.INSTANCE;
    }

    public int getMoney() {
        return money;
    }

    public void plus(int money){
        this.money += money;
    }

    public void minus(int money){
        this.money -= money;
    }
}
