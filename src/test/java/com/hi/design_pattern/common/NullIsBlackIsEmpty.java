package com.hi.design_pattern.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

public class NullIsBlackIsEmpty {
    @Test
    void 널_블랭크_엠티(){
        String str1 = "";
        String str2 = " ";
        String str3 = null;

        //str3 = null 만 == null로 잡아냄
        assertThat(str1).isNotNull();
        assertThat(str2).isNotNull();
        assertThat(str3).isNull();

        //모두 블랭크로 잡아냄
        assertThat(str1).isBlank();
        assertThat(str2).isBlank();
        assertThat(str3).isBlank(); //null예외는 안터지는데 왜 안나는 지 모를

        //빈문자열만 잡아냄 Null에서 쓰면 NullPointerException예외
        assertThat(str1).isEmpty();
        assertThat(str2).isNotEmpty();
//        assertThat(str3).isEmpty();

        assertThrows(NullPointerException.class,
                () -> str3.isBlank());

        assertThrows(NullPointerException.class,
                () -> str3.isEmpty());
//        System.out.println(str3.isBlank());

        //name == null || name.isBlank() 이렇게 쓰는 이유
        //name.isBlank() 가 NullPointerException예외를 일으키지 못하게 앞에서 거름
    }
}
