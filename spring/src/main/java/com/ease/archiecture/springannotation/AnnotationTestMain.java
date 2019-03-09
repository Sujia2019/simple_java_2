package com.ease.archiecture.springannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTestMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("AnnotationBeansTest.xml");
        Student student = (Student) context.getBean("student");
        student.clazzPrint();


        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);

        Person person = applicationContext.getBean(Person.class);

        person.setId("1");

        System.out.println(person.getId());
    }
}
