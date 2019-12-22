package com.flamingo.cap2.bean;

import org.springframework.stereotype.Component;

@Component
public class Jeep {

    public Jeep() {
        System.out.println("Jeep无参构造");
    }


    public void init(){
        System.out.println("Jeep...init...");
    }

    public void destory(){
        System.out.println("Jeep...destory");
    }
}
