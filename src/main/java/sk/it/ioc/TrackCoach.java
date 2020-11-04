package sk.it.ioc;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach(){
    }

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "Run a hard 10k";
    }

    @Override
    public String getDailyFortune() {
        return "Just do it: "+fortuneService.getFortune();
    }
}
