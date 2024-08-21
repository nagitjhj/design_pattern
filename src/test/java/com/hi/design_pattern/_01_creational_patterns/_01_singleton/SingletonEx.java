package com.hi.design_pattern._01_creational_patterns._01_singleton;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static org.assertj.core.api.Assertions.*;

public class SingletonEx {

    @Test
    void 런타임(){
        //런타임은 제공해주는 싱글톤패턴의 클래스임
        //암튼 이렇게 사용하는 것이다...

        Runtime runtime = Runtime.getRuntime();
        Runtime runtime1 = Runtime.getRuntime();
        System.out.println("runtime.maxMemory() = " + runtime.maxMemory());
        System.out.println("runtime.freeMemory() = " + runtime.freeMemory());

        assertThat(runtime).isSameAs(runtime1);
    }

    @Test
    void 싱글톤_컨텍스트(){
        //싱글톤 스코프임 스프링 컨텍스트에서 관리해주는
        //엄밀히 따지자면 싱글톤패턴은 아님

        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(TestConfig.class);
        String hello = ac.getBean("hello", String.class);
        String hello1 = ac.getBean("hello", String.class);

        assertThat(hello).isSameAs(hello1);
    }

    @Configuration
    static class TestConfig{
        @Bean
        public String hello(){
            return "hello";
        }
    }
}
