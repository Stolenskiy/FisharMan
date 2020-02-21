package Entity;

import javax.swing.*;

public class Player {
    private Position position;
    private String name;
    private Float money;
    private ImageIcon texture;
    private Inventory inventory;
    private Direction direction;

    public Player () {
    }

    public Player (Position position, String name, Float money, ImageIcon texture, Inventory inventory, Direction direction) {
        this.position = position;
        this.name = name;
        this.money = money;
        this.texture = texture;
        this.inventory = inventory;
        this.direction = direction;
    }

    public Position getPosition () {
        return position;
    }

    public void setPosition (Position position) {
        this.position = position;
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

    public ImageIcon getTexture () {
        return texture;
    }

    public void setTexture (ImageIcon texture) {
        this.texture = texture;
    }

    public Inventory getInventory () {
        return inventory;
    }

    public void setInventory (Inventory inventory) {
        this.inventory = inventory;
    }

    public Direction getDirection () {
        return direction;
    }

    public void setDirection (Direction direction) {
        this.direction = direction;
    }
}
