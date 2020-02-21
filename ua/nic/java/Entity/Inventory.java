package Entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Inventory extends InvevtoryManager {
    private Map inventoryMap;


    public void push(){

    }

    public Inventory () {
        this.inventoryMap = new HashMap();
    }
    public Inventory (Map inventoryMap) {
        this.inventoryMap = inventoryMap;
    }

}
