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
public class Options implements Serializable {

    private double difficulty;
    private double savedGame;
    private String description;

    public Options() {
    }

    public double getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(double difficulty) {
        this.difficulty = difficulty;
    }

    public double getSavedGame() {
        return savedGame;
    }

    public void setSavedGame(double savedGame) {
        this.savedGame = savedGame;
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
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.difficulty) ^ (Double.doubleToLongBits(this.difficulty) >>> 32));
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.savedGame) ^ (Double.doubleToLongBits(this.savedGame) >>> 32));
        hash = 23 * hash + Objects.hashCode(this.description);
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
        final Options other = (Options) obj;
        if (Double.doubleToLongBits(this.difficulty) != Double.doubleToLongBits(other.difficulty)) {
            return false;
        }
        if (Double.doubleToLongBits(this.savedGame) != Double.doubleToLongBits(other.savedGame)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Options{" + "difficulty=" + difficulty + ", savedGame=" + savedGame + ", description=" + description + '}';
    }

}
