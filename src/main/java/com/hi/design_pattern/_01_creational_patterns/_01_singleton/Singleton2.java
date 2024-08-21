package com.hi.design_pattern._01_creational_patterns._01_singleton;

public class Singleton2 {
    //double checked locking 기법으로 만들어보자
    //getInstance 를 실행할 때마다 synchronized가 실행되는게 아니라서 인스턴스가 없을때만 실행되어서
    //인스턴스를 필요시점에 생성할 수 있는 장점

    private static volatile Singleton2 instance; //volatile 이게 뭔지 잘 모른다 -> 모름 암튼 있어야 됨

    private Singleton2(){
    }

    public Singleton2 getInstance(){
        if(instance == null){
            synchronized (Singleton2.class){
                if(instance == null){
                    instance = new Singleton2();
                }
            }
        }

        return instance;
    }

}
