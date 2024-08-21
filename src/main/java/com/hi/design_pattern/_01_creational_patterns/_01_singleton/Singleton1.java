package com.hi.design_pattern._01_creational_patterns._01_singleton;

public class Singleton1 {
    //만약 Singleton을 생성하는데 큰 비용이 안 든다면 미리 만들어두는 방법도 있음
    //이른 초기화 eager intitalization -> 멀티스레드 관계없음
    //먼저 만드는게 단점이 될 수도... -> 안 쓰면 괜히 만든 것이니까
//    private static final Singleton INSTANCE = new Singleton();
    private static Singleton1 instance;

    private Singleton1(){
    }

    //멀티스레드일때 -> synchronized 사용해서 한번에 하나의 스레드만 들어오게
    //동기화 처리 때문에 성능에 문제가 생길수도
    //synchronized 이거 쓰는 것도 좀 신중해야함 -> 비용문제 발생
    public static synchronized Singleton1 getInstance() {
        if(instance == null){
            instance = new Singleton1();
        }
        return instance;
    }
}
