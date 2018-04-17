package com.akucieba.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VolleyballCoach implements Coach {

@Autowired
FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Practice your serve for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
