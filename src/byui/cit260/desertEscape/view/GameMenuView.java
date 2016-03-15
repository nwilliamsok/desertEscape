/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertEscape.view;

import byui.cit260.desertEscape.control.PlanetControl;
import desertescape.DesertEscape;
import java.util.Scanner;

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
    public void display() {

        System.out.println("\n" + this.displayMessage);

        boolean done = false;
        do {

            String menuOption = this.getInput();
            if (menuOption.toUpperCase().equals("Q")) {
                return;
            }
            done = this.doAction(menuOption);

        } while (!done);
    }

    @Override
    public String getInput() {

        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;

        while (!valid) {
            System.out.println("\nSelect an option");

            value = keyboard.nextLine();
            value = value.trim();

            if (value.length() < 1) {
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }

            break;

        }
        return value;

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
                this.displayMainMenuView();
                break;
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
            default:
                System.out.println("\n*** Invalid Selection *** Try again, It's not that hard.");
                break;

        }

        return true;

    }

    public void storyLine() {
        System.out.println("\n***Story line goes here ***");
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }

    public void about() {
        System.out.println("\n***About section goes here ***");
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }

    public void displayMainMenuView() {
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }

  private void viewPlanet() {
        System.out.println(DesertEscape.getGame().getPlanet().getPlanetString());
    }

    private void up() {
        PlanetControl pc = new PlanetControl();
        if (pc.up(DesertEscape.getGame()) == false) {
        System.out.println("You cannot move there");
    }
    }

    private void down() {
PlanetControl pc = new PlanetControl();
        if (pc.down(DesertEscape.getGame()) == false) {
        System.out.println("You cannot move there");
    }    }

    private void left() {
PlanetControl pc = new PlanetControl();
        if (pc.left(DesertEscape.getGame()) == false) {
        System.out.println("You cannot move there");
    }    }

    private void right() {
PlanetControl pc = new PlanetControl();
        if (pc.right(DesertEscape.getGame()) == false) {
        System.out.println("You cannot move there");
    }    }

}
