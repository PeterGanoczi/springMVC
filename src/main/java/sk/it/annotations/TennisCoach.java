package sk.it.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;
/*
    @Autowired
    public TennisCoach(FortuneService theFortuneService){
        fortuneService=theFortuneService;
    }
    */

    public TennisCoach() {
        System.out.println(">>> TennisCoach: inside default constructor");
    }

    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println(">>TennisCoach: inside of doMyStartupStuff()");
    }

    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println(">>TennisCoach: inside of doMyCleanupStuff()");
    }


    /*
    @Autowired
    public void doSomeCrazyStuff(FortuneService theFortuneService){
        System.out.println(">>> TennisCoach: inside doSomeCrazyStuff() method");
        fortuneService=theFortuneService;
    }*/

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
