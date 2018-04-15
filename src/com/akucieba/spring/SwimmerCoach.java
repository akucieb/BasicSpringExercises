package com.akucieba.spring;

public class SwimmerCoach implements Coach {

    private FortuneService fortuneService;

    public SwimmerCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swimm 5 pools";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
