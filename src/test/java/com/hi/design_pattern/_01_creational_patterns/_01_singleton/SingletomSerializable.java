package com.hi.design_pattern._01_creational_patterns._01_singleton;

import com.hi.design_pattern._01_creational_patterns._01_singleton.Singleton3;
import com.hi.design_pattern._01_creational_patterns._01_singleton.Singleton4;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

public class SingletomSerializable {
    @Test
    void 직렬화_역직렬화() throws IOException, ClassNotFoundException {
        Singleton3 instance = Singleton3.getInstance();
        Singleton3 instance2 = null;

        //try-resource 블럭
        //try 블록에 리소르를 선언하고 -> 이 리소스는 try 블록이 종료될 때 자동으로 닫힘
        //직렬화
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("instance.obj"))){
            assertThrows(NotSerializableException.class,
                    () -> out.writeObject(instance));
        }

        //역직렬화
//        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("instance.obj"))){
//            instance2 = (Singleton3) in.readObject();
//        }

//        Assertions.assertThat(instance).isNotSameAs(instance2);

        //NotSerializableException -> Serializable만 가능함

    }

    @Test
    void 직렬화_역직렬화2() throws IOException, ClassNotFoundException {
        Singleton4 instance = Singleton4.getInstance();
        Singleton4 instance2 = null;

        //try-resource 블럭
        //try 블록에 리소르를 선언하고 -> 이 리소스는 try 블록이 종료될 때 자동으로 닫힘
        //직렬화
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("instance.obj"))){
            out.writeObject(instance);
        }

        //역직렬화
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("instance.obj"))){
            instance2 = (Singleton4) in.readObject();
        }

        assertThat(instance).isSameAs(instance2);

        //NotSerializableException -> Serializable만 가능함

    }
}
