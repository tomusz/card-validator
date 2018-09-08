package com.wachowicz.udemy.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }
}
