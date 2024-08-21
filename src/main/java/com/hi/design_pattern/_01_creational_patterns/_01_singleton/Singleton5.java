package com.hi.design_pattern._01_creational_patterns._01_singleton;

public enum Singleton5 {
    //리플렉션에 안전한 코드 앤드 직렬화 역직렬화에도 안전함
    // 벗, 단점 로딩하는 순간 미리 만들어진다는 것
    // 상속을 쓰지 못한다
    //enum은 오로지 enum만 상속받을 수 있다

    INSTANCE;




    //싱글톤 권장 방법
    //1. holder 사용 - static inner 클래스 방법
    //2. enum 사용
}
