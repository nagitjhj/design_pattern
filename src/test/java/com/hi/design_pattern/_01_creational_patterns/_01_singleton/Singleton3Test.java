package com.hi.design_pattern._01_creational_patterns._01_singleton;

import com.hi.design_pattern._01_creational_patterns._01_singleton.Singleton3;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class Singleton3Test {

    @Test
    void 싱글톤_맞니(){
        Singleton3 instance = Singleton3.getInstance();
        Singleton3 instance1 = Singleton3.getInstance();

        assertThat(instance).isSameAs(instance1);
    }

    @Test
    void 리플렉션_싱글톤_부시기() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Singleton3 instance = Singleton3.getInstance();

        //java Reflection을 이용해서 객체 인스턴스 생성
        Constructor<Singleton3> declaredConstructor = Singleton3.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        Singleton3 singleton3 = declaredConstructor.newInstance();

        assertThat(instance).isNotSameAs(singleton3);
    }

    @Test
    void 리플렉션이_뭔지() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //1. getConstructor() 는 접근 가능한 생성자만 반환함!! 그래서 예외발생한 것임

        //NoSuchMethodException 호출하려는 메스드가 클래스를 찾을 수 없을 때 발생하는 예외
//        Singleton3 singleton3 = Singleton3.class.getConstructor().newInstance();
        //테스트 코드를 적어보자
        assertThrows(NoSuchMethodException.class,
                () -> Singleton3.class.getConstructor().newInstance());



        //2. getDeclaredConstructor() 모든 생성자 반환!!! -> 그래서 막아놓은 생성자가 호출된것임

        //private 으로 막아놔서 접근하려하면 접근 제한이 걸림 IllegalAccessException
        assertThrows(IllegalAccessException.class,
                () -> Singleton3.class.getDeclaredConstructor().newInstance());

        //.setAccessible(true) 지정해서 접근이 가능하도록 변경
        Constructor<Singleton3> declaredConstructor = Singleton3.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        Singleton3 singleton3 = declaredConstructor.newInstance();

        assertThat(singleton3).isInstanceOf(Singleton3.class);


        //3. getConstructors(), getDeclaredConstructors() -> 생성자를 배열로 반환
    }

    @Test
    void 입금_출금(){
        Singleton3 sister = Singleton3.getInstance();
        Singleton3 na = Singleton3.getInstance();
        Singleton3 brother = Singleton3.getInstance();

        sister.withdrawal(10000);
        na.withdrawal(10000);
        brother.deposit(20000);

        assertThat(na.getMoney()).isEqualTo(30000);
        assertThat(sister).isSameAs(brother);
    }

}