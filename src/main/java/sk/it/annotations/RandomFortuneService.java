package sk.it.annotations;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {


    private String[] data={
            "Beware of the wolf",
            "The journey is the reward",
            "Diligence is the mother of good luck"
    };
    private Random random= new Random();


    @Override
    public String getFortune() {

        int index=random.nextInt(data.length);
        String fortune=data[index];

        return fortune;
    }


}
