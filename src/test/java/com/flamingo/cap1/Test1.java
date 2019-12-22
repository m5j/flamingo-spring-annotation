package com.flamingo.cap1;

import com.flamingo.cap1.bean.GardenService;
import com.flamingo.cap1.bean.Person;
import com.flamingo.cap1.config.Cap1BeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Cap1BeanConfig.class);

        System.out.println("IOC容器创建完成");

        System.out.println("-----------");
        Person person = (Person) context.getBean("person");
        System.out.println(person);
        GardenService gardenService = context.getBean(GardenService.class);
        System.out.println(gardenService);

        System.out.println("-----------");
        String[] definitionNames = context.getBeanDefinitionNames();
        for (String name : definitionNames) {
            System.out.println(name);
        }
        System.out.println("-----------");
    }
}
