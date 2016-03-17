/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertEscape.view;

import byui.cit260.desertEscape.control.PlanetControl;
import byui.cit260.desertEscape.model.Location;
import byui.cit260.desertEscape.model.LocationType;
import desertescape.DesertEscape;

/**
 *
 * @author NicolasWilliams
 */
public class GameMenuView extends View {

    public GameMenuView() {
        super("\n                                          "
                + "\n------------------------------------------"
                + "\n |             Game Menu                 |"
                + "\n------------------------------------------"
                + "\n                                          "
                + "\n           S - Storyline                  "
                + "\n           A - About                      "
                + "\n           M - Main Menu                  "
                + "\n           V - View Planet                "
                + "\n                                          "
                + "\n           U - Move Up                    "
                + "\n           D - Move Down                  "
                + "\n           L - Move Left                  "
                + "\n           R - Move Right                 "
                + "\n                                          "
                + "\n           Q - Quit                       "
                + "\n------------------------------------------");
    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase();

        switch (value) {
            case "S":
                this.storyLine();
                break;
            case "A":
                this.about();
                break;
            case "M":
                return true;
            case "V":
                viewPlanet();
                break;
            case "U":
                up();
                break;
            case "D":
                down();
                break;
            case "L":
                left();
                break;
            case "R":
                right();
                break;
            case "Q":
                return true;
            default:
                System.out.println("\n*** Invalid Selection *** Try again, It's not that hard.");
                break;

        }

        return false;

    }

    public void storyLine() {
        System.out.println("\n***Story line goes here ***");
    }

    public void about() {
        System.out.println("\n***About section goes here ***");
    }

    private void viewPlanet() {
        Location curLoc = DesertEscape.getPlayer().getLocation();
        System.out.println(DesertEscape.getGame().getPlanet().getPlanetString(curLoc));
    }

    private void up() {
        PlanetControl pc = new PlanetControl();
        if (pc.up(DesertEscape.getGame()) == false) {
            System.out.println("You cannot move there");
        } else {
            doCondition(DesertEscape.getPlayer().getLocation());
        }
    }

    private void down() {
        PlanetControl pc = new PlanetControl();
        if (pc.down(DesertEscape.getGame()) == false) {
            System.out.println("You cannot move there");
        } else {
            doCondition(DesertEscape.getPlayer().getLocation());
        }
    }

    private void left() {
        PlanetControl pc = new PlanetControl();
        if (pc.left(DesertEscape.getGame()) == false) {
            System.out.println("You cannot move there");
        } else {
            doCondition(DesertEscape.getPlayer().getLocation());
        }
    }

    private void right() {
        PlanetControl pc = new PlanetControl();
        if (pc.right(DesertEscape.getGame()) == false) {
            System.out.println("You cannot move there");
        } else {
            doCondition(DesertEscape.getPlayer().getLocation());
        }
    }

    private void doCondition(Location newLocation) {
        
        //Challenges 
        if(newLocation.getType() == LocationType.AlienCamp) {
            
        } else if (newLocation.getType() == LocationType.Desert___) {
            WindChillView wcv = new WindChillView();
            wcv.displayWindChillView();
        }
        
        //Survivors
        if(newLocation.getSurvivor() != null) {
            System.out.println("You ran into: " + newLocation.getSurvivor().getName() + "\n" + newLocation.getSurvivor().getDescription());
        }
        
    }
    
}
