/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertEscape.model;

import java.io.Serializable;

/**
 *
 * @author NicolasWilliams
 */
public enum Item implements Serializable {

    Technology("Technology"),
    Gem("Gem"),
    Rock("Rock"),
    Water("Water"),
    Ore("Ore"),
    Schematic("Schematic");

    private final String ItemType;

    private Item(String ItemType) {
        this.ItemType = ItemType;
    }

    public String getItemType() {
        return ItemType;
    }

    @Override
    public String toString() {
        return "Item{" + "ItemType=" + ItemType + '}';
    }


   
   

}
