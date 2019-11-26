package org.springinaction.newKnights;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springinaction.oldKnights.Person;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("面向切面_改造后.xml");
        Person person = (Person) context.getBean("person");
        person.triggleDoSthImp();
    }
}
