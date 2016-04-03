/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertEscape.control;

import byui.cit260.desertEscape.model.Location;
import byui.cit260.desertEscape.model.Player;
import desertescape.Game;
import java.io.Serializable;
import byui.cit260.desertEscape.model.Planet;
import byui.cit260.desertEscape.view.ErrorView;
import desertescape.DesertEscape;
import exceptions.GameException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author NicolasWilliams
 */
public class PlanetControl implements Serializable {

    public boolean up(Game game) {
        Player player = game.getPlayer();
        Location currentLocation = player.getLocation();
        Planet planet = game.getPlanet();

        if (currentLocation.getRow() == 0) {
            return false;

        }

        player.setLocation(planet.getLocation(currentLocation.getRow() - 1, currentLocation.getCol()
        ));

      return true;
    }

    public boolean right(Game game) {
        Player player = game.getPlayer();
        Location currentLocation = player.getLocation();
        Planet planet = game.getPlanet();

        if (currentLocation.getCol() == Planet.NUM_COLS - 1) {
            return false;

        }

        player.setLocation(planet.getLocation(currentLocation.getRow(), currentLocation.getCol() + 1));

        return true;
    }

    public boolean down(Game game) {
        Player player = game.getPlayer();
        Location currentLocation = player.getLocation();
        Planet planet = game.getPlanet();

        if (currentLocation.getRow() == Planet.NUM_ROWS - 1) {
            return false;

        }

        player.setLocation(planet.getLocation(currentLocation.getRow() + 1, currentLocation.getCol()));

        return true;
    }

    public boolean left(Game game) {
        
        Player player = game.getPlayer();
        Location currentLocation = player.getLocation();
        Planet planet = game.getPlanet();
        
        if(currentLocation.getCol() == 0) {
            return false;
        }
        
        player.setLocation(planet.getLocation(currentLocation.getRow(), currentLocation.getCol() - 1));
        
        return true;
    }
    
    public static void printPlanetMap(String filePath) throws GameException {
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            Location curLoc = DesertEscape.getPlayer().getLocation();
            
            oos.writeObject("  ***************************************THIS IS THE PLANET MAP***************************************\n\n" + "Player Location: \n"+ DesertEscape.getGame().getPlanet().getPlanetString(curLoc) + "\n\n\nItem Locations: \n" + DesertEscape.getGame().getPlanet().getItemString() + "\n\n\nSurvivor Locations: \n" + DesertEscape.getGame().getPlanet().getSurvivorString());
        } catch (Exception e) {
            ErrorView.display("GameControl", e.getMessage());
        }
    }

}
