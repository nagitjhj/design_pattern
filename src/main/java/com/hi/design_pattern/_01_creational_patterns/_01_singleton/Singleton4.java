package com.hi.design_pattern._01_creational_patterns._01_singleton;

import java.io.Serializable;

public class Singleton4 implements Serializable {
    //static inner class 사용하는 방법 -> 권장!!!
    //멀티스레드에서 안전하고, Singleton3을 호출할 때 인스턴스를 생성하는 방법
    private Singleton4() {
    }

    private static class SingletonHolder{
        private static final Singleton4 INSTANCE = new Singleton4(); //늦은 초기화(lazy initialization)
    }

    public static Singleton4 getInstance(){
        return SingletonHolder.INSTANCE;
    }

    //직렬화, 역직렬화 막기위해서 쓰는데 나중에 해볼것임 - 이유 : 지금은 하기시름
    protected Object readResolve(){
        return getInstance();
    }

}
