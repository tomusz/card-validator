package com.wachowicz.udemy.spring.Apps;

import com.wachowicz.udemy.spring.coaches.GymCoach;
import com.wachowicz.udemy.spring.coaches.KayakCoach;
import com.wachowicz.udemy.spring.config.SportConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GymJavaConfigSpringApp {

    public static void main(String[] args) {

        // read spring config java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        //get the bean from spring container
        GymCoach coach = context.getBean("gymCoach", GymCoach.class);
        //call a method on the bean
        System.out.println(coach.getDailyWorkout());

        //call method to get daily fortune
        System.out.println(coach.getDailyFortune());

        context.close();
    }
}
