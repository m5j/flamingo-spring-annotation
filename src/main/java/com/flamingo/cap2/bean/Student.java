package com.flamingo.cap2.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Setter
@Getter
@ToString
@Component
public class Student implements InitializingBean, DisposableBean {

    private String name;
    private int age;

    public Student() {
        System.out.println("Student无参构造");
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Student...afterPropertiesSet...");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Student...destroy...");
    }
}
