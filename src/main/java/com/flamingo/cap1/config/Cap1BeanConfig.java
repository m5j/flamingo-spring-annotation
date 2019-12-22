package com.flamingo.cap1.config;

import com.flamingo.cap1.bean.Dog;
import com.flamingo.cap1.bean.GardenService;
import com.flamingo.cap1.bean.Person;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(value = {"com.flamingo.cap1.bean"})
@Import(value = {GardenService.class})
public class Cap1BeanConfig {

    @Bean
    @Conditional(WinCondition.class)
    public Person person() {
        System.out.println("给容器注入person");
        return new Person("james", 35);
    }

    @Bean
    @Conditional(LinuxCondition.class)
    public Dog dog() {
        System.out.println("给容器注入dog");
        return new Dog("旺财", 2);
    }
}
