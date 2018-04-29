import java.util.Random;

public class RandomFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        String[] fortunes = {
                "You are having a great day.",
                "Your day sucks, man",
                "I wish I had a day like you are having right now"
        };
        Random generator = new Random();
        return fortunes[generator.nextInt(2)];
    }
}
