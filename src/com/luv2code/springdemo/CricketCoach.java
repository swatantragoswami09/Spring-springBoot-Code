package com.luv2code.springdemo;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    
    public CricketCoach() {
        System.out.println("CricketCoach: inside no-args constructor");
    }
    
    public FortuneService getFortuneService() {
        return fortuneService;
    }
    
    // out setter method
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: inside setter method");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Prtice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
        
    }
    
}
