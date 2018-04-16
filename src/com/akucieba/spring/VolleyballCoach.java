package com.akucieba.spring;

import org.springframework.stereotype.Component;

@Component
public class VolleyballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice your serve for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return "It's your lucky day";
    }
}
