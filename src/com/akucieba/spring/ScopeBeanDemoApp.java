package com.akucieba.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeBeanDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
        Coach theCoach = context.getBean("mySwimmerCoach", Coach.class);
        Coach alphaCoach = context.getBean("mySwimmerCoach", Coach.class);

        boolean result = (theCoach == alphaCoach);
        System.out.println(result);

        System.out.println("\nPointing to the same object: " + result);

        System.out.println("\nMemory location for theCoach: " + theCoach);

        System.out.println("\nMemory location for alphaCoach: " + alphaCoach + "\n");

        context.close();
    }
}
