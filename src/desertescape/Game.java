/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desertescape;

import byui.cit260.desertEscape.model.Player;
import java.io.Serializable;
import byui.cit260.desertEscape.model.Planet;

/**
 *
 * @author NicolasWilliams
 */
public class Game implements Serializable {
    
    private Player player;
    private Planet planet;

    public Game() {
    }
    
    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Planet getPlanet() {
        return planet;
    }

    public void setPlanet(Planet planet) {
        this.planet = planet;
    }
    
    
    
    
}