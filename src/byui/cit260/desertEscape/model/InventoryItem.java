/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertEscape.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author NicolasWilliams
 */
public enum InventoryItem implements Serializable {

    resourceTechnology("Technology"),
    resourseGems("Gems"),
    resourceRocks("Rocks"),
    resourceWater("Water"),
    resourceOre("Ore"),
    resourceSchematic("Schematic");

    private final String inventoryList;

    private InventoryItem(String inventoryList) {
        this.inventoryList = inventoryList;
    }

    public String getInventoryList() {
        return inventoryList;
    }

    @Override
    public String toString() {
        return "InventoryItem{" + "inventoryList=" + inventoryList + '}';
    }

}
