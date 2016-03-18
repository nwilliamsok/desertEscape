/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertEscape.control;

import byui.cit260.desertEscape.model.Planet;
import byui.cit260.desertEscape.model.Player;
import byui.cit260.desertEscape.model.Survivor;
import desertescape.DesertEscape;
import desertescape.Game;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NicolasWilliams
 */
public class GameControl implements Serializable {

    public static Player createPlayer(String name) {
        if (name == null) {
            return null;
        }

        Player player = new Player();
        player.setName(name);

        DesertEscape.setPlayer(player);

        return player;
    }

    public static void createNewGame(Player player) {
        
        Game g = new Game();
        g.setPlayer(player);
        
        Planet gamePlanet = new Planet();
        g.setPlanet(gamePlanet);
        
        setSurvivorLocations(gamePlanet);
        
        player.setLocation(gamePlanet.getLocation(0, 0));
        
        DesertEscape.setGame(g);
    }
    
    

    public static List<Survivor> createSurvivorList() {
        List<Survivor> survivorList = new ArrayList<>();

        Survivor Joe = new Survivor();
        Joe.setName("Joe");
        Joe.setDescription("He is strong.");
        survivorList.add(Joe);

        Survivor Matt = new Survivor();
        Matt.setName("Matt");
        Matt.setDescription("He is brave.");
        survivorList.add(Matt);

        Survivor Ben = new Survivor();
        Ben.setName("Ben");
        Ben.setDescription("He is smart.");
        survivorList.add(Ben);

        Survivor John = new Survivor();
        John.setName("John");
        John.setDescription("He is quick.");
        survivorList.add(John);

        Survivor Tom = new Survivor();
        Tom.setName("Tom");
        Tom.setDescription("He was just an example and was meant to be deleted from the game before the final release.");
        survivorList.add(Tom);

        Survivor Samantha = new Survivor();
        Samantha.setName("Samantha");
        Samantha.setDescription("She is a woman.");
        survivorList.add(Samantha);

        Survivor Gary = new Survivor();
        Gary.setName("Gary");
        Gary.setDescription("He is also a woman...");
        survivorList.add(Gary);

        Survivor Player1 = new Survivor();
        Player1.setName("Player1");
        Player1.setDescription("Player1 is not even a real person and did not even deserve a name.");
        survivorList.add(Player1);

        Survivor ThePlayerFormerlyKnownAsMousecop = new Survivor();
        ThePlayerFormerlyKnownAsMousecop.setName("ThePlayerFormerlyKnownAsMousecop");
        ThePlayerFormerlyKnownAsMousecop.setDescription("University of Missouri, Columbia.");
        survivorList.add(ThePlayerFormerlyKnownAsMousecop);

        return survivorList;
    }

    public static void setSurvivorLocations(Planet planet) {
        
        List<Survivor> survivor = createSurvivorList();
        boolean success = false;
        
        for(Survivor s : survivor) {
            
            do {
                int row = (int)(Math.random() * Planet.NUM_ROWS);
                int col = (int)(Math.random() * Planet.NUM_COLS);
            
                 success = false;
                
                if(planet.getLocation(row, col).getSurvivor() == null) {
                    planet.getLocation(row, col).setSurvivor(s);
                    success = true;
                }
                
            } while(success == false);
            
        }
        
    }

}
