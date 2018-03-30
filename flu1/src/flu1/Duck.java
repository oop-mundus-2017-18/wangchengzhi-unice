package flu1;

import java.util.Random;

public class Duck extends Animal {
    public static final Double INFECTED = 0.1;

    public Duck() {
        super();
        Random random = new Random();

        if (random.nextInt(100) <= INFECTED * 100)
            fallIll(new H1N1());
    }
}