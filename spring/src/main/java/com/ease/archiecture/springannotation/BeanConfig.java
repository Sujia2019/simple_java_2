package com.ease.archiecture.springannotation;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {


    @Bean
    public Person person() {
        return new Person();
    }
}
