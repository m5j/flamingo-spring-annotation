package com.flamingo.cap2.config;

import com.flamingo.cap2.bean.Person;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(value = "com.flamingo.cap2.bean")
public class Cap2BeanConfig {

    @Bean(initMethod = "init", destroyMethod = "destory1")
//    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Person person() {
        return new Person();
    }
}
