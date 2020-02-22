package Entity;

import javax.swing.*;
import java.util.Objects;

public class Fish implements IInventoryEntity {
    private String name;
    private Float weight;
    private StateFood stateFood;
    private Integer positionInInventory;
    private ImageIcon texture;

    public Fish (String name, Float weight, StateFood stateFood, Integer positionInInventory, ImageIcon texture) {
        this.name = name;
        this.weight = weight;
        this.stateFood = stateFood;
        this.positionInInventory = positionInInventory;
        this.texture = texture;
    }

    public Fish () {
    }

    public Fish (String name, Float weight) {
        this.name = name;
        this.weight = weight;
        stateFood = StateFood.RAW;
    }

    public Fish (String name, Float weight, StateFood stateFood) {
        this.name = name;
        this.weight = weight;
        this.stateFood = stateFood;
    }

    @Override
    public String getName () {
        return name;
    }

    @Override
    public void setName (String name) {
        this.name = name;
    }

    @Override
    public Float getWeight () {
        return weight;
    }

    @Override
    public void setWeight (Float weight) {
        this.weight = weight;
    }

    public StateFood getStateFood () {
        return stateFood;
    }

    public void setStateFood (StateFood stateFood) {
        this.stateFood = stateFood;
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

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (!(o instanceof Fish)) return false;
        Fish fish = (Fish) o;
        return Objects.equals(getName(), fish.getName()) &&
                Objects.equals(getWeight(), fish.getWeight()) &&
                getStateFood() == fish.getStateFood() &&
                Objects.equals(getPositionInInventory(), fish.getPositionInInventory()) &&
                Objects.equals(getTexture(), fish.getTexture());
    }

    @Override
    public int hashCode () {
        return Objects.hash(getName(), getWeight(), getStateFood(), getPositionInInventory(), getTexture());
    }

    @Override
    public String toString () {
        return "Fish{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", stateFood=" + stateFood +
                ", positionInInventory=" + positionInInventory +
                ", texture=" + texture +
                '}';
    }
}
