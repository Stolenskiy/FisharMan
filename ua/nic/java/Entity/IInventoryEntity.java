package Entity;

import javax.swing.*;

public interface IInventoryEntity {
    Integer getPositionInInventory();
    void setPositionInInventory(Integer positionInInventory);
    Float getWeight();
    void setWeight(Float weight);
    String getName();
    void setName(String name);
    ImageIcon getTexture ();
    void setTexture (ImageIcon texture);
}
