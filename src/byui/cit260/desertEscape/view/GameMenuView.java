/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertEscape.view;

import byui.cit260.desertEscape.control.GameControl;
import byui.cit260.desertEscape.control.PlanetControl;
import byui.cit260.desertEscape.model.Item;
import byui.cit260.desertEscape.model.Location;
import byui.cit260.desertEscape.model.LocationType;
import byui.cit260.desertEscape.model.Player;
import desertescape.DesertEscape;
import exceptions.GameException;
import java.util.Arrays;
import java.util.List;

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
                + "\n                                          "
                + "\n           V - View Planet                "
                + "\n           P - Print Planet Map           "
                + "\n           I - Inventory                  "
                + "\n           C - Collect Item               "
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

        try {
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
                    case "P":
                this.printPlanetMap();
                    break;
                case "C":
                    collectItem();
                    break;
                case "I":
                    displayInventory();
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
                       ErrorView.display(this.getClass().getName(),"\n*** Invalid Selection *** Try again, It's not that hard.");
                    break;

            }

            return false;
        } catch (GameException ex) {
               ErrorView.display(this.getClass().getName(),"Error in GameMenuView");
        }
        return false;

    }

    public void storyLine() {
        this.console.println("\n***Story line goes here ***");
    }

    public void about() {
        this.console.println("\n***About section goes here ***");
    }

    private void viewPlanet() {
        Location curLoc = DesertEscape.getPlayer().getLocation();
        this.console.println(DesertEscape.getGame().getPlanet().getPlanetString(curLoc));
    }

    private void up() throws GameException {
        PlanetControl pc = new PlanetControl();
        if (pc.up(DesertEscape.getGame()) == false) {
            this.console.println("You cannot move there");
        } else {
            doCondition(DesertEscape.getPlayer().getLocation());
        }
    }

    private void down() throws GameException {
        PlanetControl pc = new PlanetControl();
        if (pc.down(DesertEscape.getGame()) == false) {
            this.console.println("You cannot move there");
        } else {
            doCondition(DesertEscape.getPlayer().getLocation());
        }
    }

    private void left() throws GameException {
        PlanetControl pc = new PlanetControl();
        if (pc.left(DesertEscape.getGame()) == false) {
            this.console.println("You cannot move there");
        } else {
            doCondition(DesertEscape.getPlayer().getLocation());
        }
    }

    private void right() throws GameException {
        PlanetControl pc = new PlanetControl();
        if (pc.right(DesertEscape.getGame()) == false) {
            this.console.println("You cannot move there");
        } else {
            doCondition(DesertEscape.getPlayer().getLocation());
        }
    }

    private void doCondition(Location newLocation) throws GameException {

        //Challenges 
        if (newLocation.getType() == LocationType.AlienCamp) {
            TimeMachineView tmv = new TimeMachineView();
            tmv.displayTimeMachineView();
        } else if (newLocation.getType() == LocationType.Desert___) {
            WindChillView wcv = new WindChillView();
            wcv.displayWindChillView();
        } else if (newLocation.getType() == LocationType.Caves____) {
            FillPitView fpv = new FillPitView();
            fpv.displayFillPitView();
        }

        //Survivors
        if (newLocation.getSurvivor() != null) {
            this.console.println("You ran into: " + newLocation.getSurvivor().getName() + "\n" + newLocation.getSurvivor().getDescription());
        }

    }
    
    private void displayInventory() {
               throw new UnsupportedOperationException("\tNot supported yet."); //To change body of generated methods, choose Tools | Templates.
       //this.console.println(Arrays.toString(Item.values()));
    }

    private void collectItem() {
       throw new UnsupportedOperationException("\tNot supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

     private void printPlanetMap() {
        console.println("Enter file name: ");
        try {
            String fileName = keyboard.readLine();
            PlanetControl.printPlanetMap(fileName);
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(), "Error on input");
        }
    }


}
