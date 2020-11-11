package sk.it.annotations;

public class SadFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is a bad day";
    }
}
