package com.hi.design_pattern.singleton;

public class Singleton3 {
    //static inner class 사용하는 방법 -> 권장!!!
    //멀티스레드에서 안전하고, Singleton3을 호출할 때 인스턴스를 생성하는 방법
    private Singleton3() {
    }

    private static class SingletonHolder{
        private static final Singleton3 INSTANCE = new Singleton3(); //늦은 초기화(lazy initialization)
    }

    public static Singleton3 getInstance(){
        return SingletonHolder.INSTANCE;
    }



}