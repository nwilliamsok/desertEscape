/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desertescape;

import byui.cit260.desertEscape.model.InventoryItem;
import byui.cit260.desertEscape.model.MainMenu;
import byui.cit260.desertEscape.model.Player;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

/**
 *
 * @author NicolasWilliams
 */
public class Game implements Serializable {

    private double totalTime;

    private Character[] character;
    private InventoryItem[] inventoryItem;
    private Map map;
    private MainMenu mainMenu;

    public Game() {
    }

    public Character[] getCharacter() {
        return character;
    }

    public InventoryItem[] getInventoryItem() {
        return inventoryItem;
    }

    public Map getMap() {
        return map;
    }

    public MainMenu getMainMenu() {
        return mainMenu;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    public void setCharacter(Character[] character) {
        this.character = character;
    }

    public void setInventoryItem(InventoryItem[] inventoryItem) {
        this.inventoryItem = inventoryItem;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public void setMainMenu(MainMenu mainMenu) {
        this.mainMenu = mainMenu;
    }

    @Override
    public String toString() {
        return "Game{" + "totalTime=" + totalTime + ", character=" + Arrays.toString(character) + ", inventoryItem=" + Arrays.toString(inventoryItem) + ", map=" + map + ", mainMenu=" + mainMenu + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.totalTime) ^ (Double.doubleToLongBits(this.totalTime) >>> 32));
        hash = 31 * hash + Arrays.deepHashCode(this.character);
        hash = 31 * hash + Arrays.deepHashCode(this.inventoryItem);
        hash = 31 * hash + Objects.hashCode(this.map);
        hash = 31 * hash + Objects.hashCode(this.mainMenu);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.totalTime) != Double.doubleToLongBits(other.totalTime)) {
            return false;
        }
        if (!Arrays.deepEquals(this.character, other.character)) {
            return false;
        }
        if (!Arrays.deepEquals(this.inventoryItem, other.inventoryItem)) {
            return false;
        }
        if (!Objects.equals(this.map, other.map)) {
            return false;
        }
        if (!Objects.equals(this.mainMenu, other.mainMenu)) {
            return false;
        }
        return true;
    }

    public void setPlayer(Player player) {
        System.out.println("setPlayer function called");
    }

    public void setInventory(InventoryItem[] inventoryList) {
        System.out.println("setInventory function called");
    }

}
