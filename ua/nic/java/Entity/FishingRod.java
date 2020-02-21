package Entity;

import javax.swing.*;
import java.util.Objects;

public class FishingRod implements IInventoryEntity {
    private String name;
    private Float money;
    private Float strength;
    private Float weight;
    private Integer positionInInventory;
    private ImageIcon texture;
    boolean working;

    public FishingRod (String name, Float money, Float strength, Float weight, Integer positionInInventory, ImageIcon texture, boolean working) {
        this.name = name;
        this.money = money;
        this.strength = strength;
        this.weight = weight;
        this.positionInInventory = positionInInventory;
        this.texture = texture;
        this.working = working;
    }

    public FishingRod (String name, Float money, Float strength, Float weight, boolean working) {
        this.name = name;
        this.money = money;
        this.strength = strength;
        this.weight = weight;
        this.working = working;
    }

    public FishingRod () {
    }

    @Override
    public String getName () {
        return name;
    }

    @Override
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

    @Override
    public Float getWeight () {
        return weight;
    }

    @Override
    public void setWeight (Float weight) {
        this.weight = weight;
    }

    @Override
    public Integer getPositionInInventory () {
        return positionInInventory;
    }

    @Override
    public void setPositionInInventory (Integer positionInInventory) {
        this.positionInInventory = positionInInventory;
    }

    @Override
    public ImageIcon getTexture () {
        return texture;
    }

    @Override
    public void setTexture (ImageIcon texture) {
        this.texture = texture;
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
                getStrength().equals(that.getStrength()) &&
                getWeight().equals(that.getWeight()) &&
                getPositionInInventory().equals(that.getPositionInInventory()) &&
                getTexture().equals(that.getTexture());
    }

    @Override
    public int hashCode () {
        return Objects.hash(getName(), getMoney(), getStrength(), getWeight(), getPositionInInventory(), getTexture(), isWorking());
    }

    @Override
    public String toString () {
        return "FishingRod{" +
                "name='" + name + '\'' +
                ", money=" + money +
                ", strength=" + strength +
                ", weight=" + weight +
                ", positionInInventory=" + positionInInventory +
                ", texture=" + texture +
                ", working=" + working +
                '}';
    }
}
