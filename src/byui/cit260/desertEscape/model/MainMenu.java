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
public class MainMenu implements Serializable {

    private double activePlayer;
    private String description;

    public MainMenu() {
    }

    public double getActivePlayer() {
        return activePlayer;
    }

    public void setActivePlayer(double activePlayer) {
        this.activePlayer = activePlayer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.activePlayer) ^ (Double.doubleToLongBits(this.activePlayer) >>> 32));
        hash = 11 * hash + Objects.hashCode(this.description);
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
        final MainMenu other = (MainMenu) obj;
        if (Double.doubleToLongBits(this.activePlayer) != Double.doubleToLongBits(other.activePlayer)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MainMenu{" + "activePlayer=" + activePlayer + ", description=" + description + '}';
    }

}
