package Entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<Integer, IInventoryEntity> inventoryMap;

    public void put (IInventoryEntity inventoryEntity) {
        if (inventoryEntity != null)
            inventoryMap.put(inventoryEntity.getPositionInInventory(), inventoryEntity);
        else System.err.println("В класі Inventory в метод put передається null");
    }
    public IInventoryEntity get (Integer positionInInventory){
        return inventoryMap.get(positionInInventory);
    }
    public Inventory () {
        this.inventoryMap = new HashMap();
    }

    public Inventory (Map inventoryMap) {
        this.inventoryMap = inventoryMap;
    }

}
