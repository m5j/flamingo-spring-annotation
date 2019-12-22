package com.flamingo.cap2;

import com.flamingo.cap2.config.Cap2BeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test2 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Cap2BeanConfig.class);
        System.out.println("IOC容器创建完成");

//        Object person = context.getBean("person");

//        context.removeBeanDefinition("person");

        context.close();
    }
}
