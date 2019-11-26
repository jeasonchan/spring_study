package org.springinaction.oldKnights;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("面向切面_未改造前.xml");
        Person person = (Person) context.getBean("person");
        person.triggleDoSthImp();
    }
}
