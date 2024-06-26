package com.hi.design_pattern._01_creational_pattern._01_singleton;

import com.hi.design_pattern._01_creational_patterns._01_singleton.SingletonMoney;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SingletonExTest {

    @Test
    void 돈꺼내기(){
        SingletonMoney my = SingletonMoney.getInstance();
        SingletonMoney sister = SingletonMoney.getInstance();
        SingletonMoney brother = SingletonMoney.getInstance();

        sister.minus(10000);
        brother.minus(10000);
        my.plus(20000);

        Assertions.assertThat(my.getMoney()).isEqualTo(30000);
    }

}