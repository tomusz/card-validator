package com.wachowicz.udemy.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

    public static void main(String[] args) {
        //load spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from spring container
        Coach theCoach = context.getBean("tennisCoach", TennisCoach.class);

        Coach alphaCoach = context.getBean("tennisCoach", TennisCoach.class);

        //check if they are the same

        boolean results = (theCoach == alphaCoach);

        //print results

        System.out.println("\nPointing to the same object: " + results);

        System.out.println("\nMemory location for theCoach: " + theCoach);

        System.out.println("\nMemory location for alphaCoach: " + alphaCoach + "\n");

        //close
        context.close();
    }
}
