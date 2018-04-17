package com.akucieba.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeAnnotationDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach theCoach = context.getBean("volleyballCoach",Coach.class);

        System.out.println(theCoach.getDailyFortune());

        context.close();
    }
}
