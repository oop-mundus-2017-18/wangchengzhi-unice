package flu1;

import java.util.ArrayList;
import java.util.Collection;

public abstract class Virus {

    private Collection<Class<? extends Creature>> infectables;
    private Double infectionRatio;
    private Integer incubationTime;
    private Integer contagiousTime;
    private Integer recoveringTime;

   

    protected Virus(Double infectionRatio, Integer incubationTime, Integer contagiousTime, Integer recoveringTime) {
        this.infectionRatio = infectionRatio;
        this.incubationTime = incubationTime;
        this.contagiousTime = contagiousTime;
        this.recoveringTime = recoveringTime;
        this.infectables = new ArrayList<>();
    }

    protected void addInfectable(Class<? extends Creature> creatureClass) {
        infectables.add(creatureClass);
    }

    public boolean canInfect(Creature creature) {
        return infectables.contains(creature.getClass());
    }

    public Double getInfectionRatio() {
        return infectionRatio;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }

    public Integer getIncubationTime() {
        return incubationTime;
    }

    public Integer getContagiousTime() {
        return contagiousTime;
    }

    public Integer getRecoveringTime() {
        return recoveringTime;
    }
}