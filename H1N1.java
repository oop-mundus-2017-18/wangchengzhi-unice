package flu1;

public class H1N1 extends Virus {
    public H1N1() {
        super(0.4, 5, 70, 40);
        addInfectable(Pig.class);
        addInfectable(Human.class);
    }
}