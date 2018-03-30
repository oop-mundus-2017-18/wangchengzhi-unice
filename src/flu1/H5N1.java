package flu1;

public class H5N1 extends Virus {
    public H5N1() {
        super(0.6, 3, 50, 30);
        addInfectable(Duck.class);
        addInfectable(Chicken.class);
        addInfectable(Human.class);
    }
}