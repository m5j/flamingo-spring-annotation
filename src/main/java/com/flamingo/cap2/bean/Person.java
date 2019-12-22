package com.flamingo.cap2.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

@Setter
@Getter
@ToString
public class Person implements InitializingBean, DisposableBean {
    private String name;
    private int age;


    public Person() {
        System.out.println("Person无参构造");
    }

    public void init() {
        System.out.println("Person...init...");
    }

    public void destory1() {
        System.out.println("Person...destory1...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Person...afterPropertiesSet...");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Person...destroy...");
    }


}
