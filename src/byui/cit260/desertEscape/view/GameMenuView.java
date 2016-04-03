/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertEscape.view;

import byui.cit260.desertEscape.control.ItemControl;
import byui.cit260.desertEscape.control.PlanetControl;
import byui.cit260.desertEscape.model.Item;
import byui.cit260.desertEscape.model.Location;
import byui.cit260.desertEscape.model.LocationType;
import desertescape.DesertEscape;
import exceptions.GameException;

/**
 *
 * @author NicolasWilliams
 */
public class GameMenuView extends View {

    public GameMenuView() {
        super("\n                                          "
                + "\n------------------------------------------"
                + "\n|              Game Menu                 |"
                + "\n------------------------------------------"
                + "\n                                          "
                + "\n           S - Storyline                  "
                + "\n           A - About                      "
                + "\n           M - Main Menu                  "
                + "\n                                          "
                + "\n           V - View Planet                "
                + "\n           P - Print Planet Map           "
                + "\n           W - Where Am I?                "
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
                case "W":
                    displayPlayerLocation();
                    break;
                case "CHEAT":
                    cheatView();
                    break;
                case "Q":
                    return true;
                default:
                    ErrorView.display(this.getClass().getName(), "\n*** Invalid Selection *** Try again, It's not that hard.");
                    break;

            }

            return false;
        } catch (GameException ex) {
            ErrorView.display(this.getClass().getName(), "Error in GameMenuView");
        }
        return false;

    }

    public void storyLine() {
        this.console.println(
                "\n                                          "
                + "\n------------------------------------------"
                + "\n|               Storyline                |"
                + "\n------------------------------------------"
                + "\n                                          "
                + "\n              You are ALONE               "
                + "\n      You wake up among the wreakage      "
                + "\n        Of your crashed escape pod        "
                + "\n                                          "
                + "\n            It's hot, very hot.           "
                + "\n  And you cant seem to get your bearings  "
                + "\n   After a few moments, your eyes adjust  "
                + "\n   And you are able to see that you are   "
                + "\n     Definitely in some sort of desert    "
                + "\n                                          "
                + "\n    'I REALLY hope this whole planet      "
                + "\n             is not a desert'             "
                + "\n                                          "
                + "\n       You must find some resources       "
                + "\n     To aid in your survival among the    "
                + "\n       Seemingly endless sea of sand      "
                + "\n                                          "
                + "\n      Hopefully other survivors made      "
                + "\n     It off of mother earth after the     "
                + "\n         Aliens came to terraform         "
                + "\n    Lets see what we can find on this     "
                + "\n                  Planet                  "
                + "\n                                          "
                + "\n------------------------------------------");
    }

    public void about() {
        this.console.println(
                "\n                                          "
                + "\n------------------------------------------"
                + "\n|   Collect items and find survivors     |"
                + "\n|    To aid in your survival on the      |"
                + "\n|             Desert planet              |"
                + "\n|                                        |"
                + "\n|    Find a way to save mother earth     |"
                + "\n|   From the aliens that have come to    |"
                + "\n|          Terraform the planet          |"
                + "\n|                                        |"
                + "\n|         *      Game by:     *          |"
                + "\n|         *  Nicolas Willams  *          |"
                + "\n|         *         &         *          |"
                + "\n|         *   Austin Hanson   *          |"
                + "\n------------------------------------------");
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

        //Items
        if (newLocation.getItem() != null) {
            this.console.println("\nYou found: " + newLocation.getItem().getName());
        }

        //Survivors
        if (newLocation.getSurvivor() != null) {
            this.console.println("\nYou ran into: " + newLocation.getSurvivor().getName() + "\n" + newLocation.getSurvivor().getDescription());
        }

    }

    private void displayInventory() {
        console.println("Inventory: \n");
        for (Item p : DesertEscape.getGame().getPlayer().inventory) {
            console.println(p.getName());
        }

    }

    private void collectItem() {
        ItemControl ic = new ItemControl();
        if (ic.findItem(DesertEscape.getPlayer())) {
            console.println("You have collected " + DesertEscape.getPlayer().getInventory().get(DesertEscape.getPlayer().getInventory().size() - 1).getName());
        } else {
            System.err.println("\nNothing useful here.");

        }
    }

    private void printPlanetMap() {
        try {
            String fileName = "PlanetMap.txt";
            PlanetControl.printPlanetMap(fileName);
            console.println("Printed map to PlanetMap.txt");
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(), "Error on input");
        }
    }

    private void displayPlayerLocation() {
        Location l = DesertEscape.getGame().getPlayer().getLocation();
        console.println("You are at: (" + l.getRow() + ", " + l.getCol() + ")");
    }

    private void cheatView() {
        Location curLoc = DesertEscape.getPlayer().getLocation();
        this.console.println("Item Locations: \n" + DesertEscape.getGame().getPlanet().getItemString() + "\n\n\nSurvivor Locations: \n" + DesertEscape.getGame().getPlanet().getSurvivorString());
    }

}
