package Entity;

import java.util.Objects;

public class FishingRod {
    private String name;
    private Float money;
    private Float strength;
    boolean working;

    public FishingRod (String name, Float money, Float strength, boolean working) {
        this.name = name;
        this.money = money;
        this.strength = strength;
        this.working = working;
    }

    public FishingRod () {
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public Float getMoney () {
        return money;
    }

    public void setMoney (Float money) {
        this.money = money;
    }

    public Float getStrength () {
        return strength;
    }

    public void setStrength (Float strength) {
        this.strength = strength;
    }

    public boolean isWorking () {
        return working;
    }

    public void setWorking (boolean working) {
        this.working = working;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (!(o instanceof FishingRod)) return false;
        FishingRod that = (FishingRod) o;
        return isWorking() == that.isWorking() &&
                getName().equals(that.getName()) &&
                getMoney().equals(that.getMoney()) &&
                getStrength().equals(that.getStrength());
    }

    @Override
    public int hashCode () {
        return Objects.hash(getName(), getMoney(), getStrength(), isWorking());
    }
}
