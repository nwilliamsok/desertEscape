/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertEscape.view;

import java.util.Scanner;

/**
 *
 * @author NicolasWilliams
 */
public class HelpMenuView {

    private String help;

    public HelpMenuView() {
        this.help = "\n                                          "
                + "\n------------------------------------------"
                + "\n |             Help Menu                 |"
                + "\n------------------------------------------"
                + "\n                                          "
                + "\n           S - Storyline                  "
                + "\n           A -   About                    "
                + "\n           M - Main Menu                  "
                + "\n           Q -    Quit                    "
                + "\n------------------------------------------";
    }

    public void displayHelpMenuView() {

        System.out.println("\n" + this.help);

        boolean done = false;
        do {

            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) {
                return;
            }
            done = this.doAction(menuOption);

        } while (!done);
    }

    private String getMenuOption() {

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

    private boolean doAction(String choice) {

        choice = choice.toUpperCase();

        switch (choice) {
            case "S":
                this.storyLine();
                break;
            case "A":
                this.about();
                break;
            case "M":
                this.displayMainMenu();
                break;

            default:
                System.out.println("\n*** Invalid Selection *** Try again, It's not that hard.");
                break;

        }

        return true;

    }

    private void storyLine() {
        System.out.println("\n***Story line goes here ***");
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.displayMainMenuView();
    }

    private void about() {
        System.out.println("\n***About section goes here ***");
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.displayMainMenuView();
    }

    private void displayMainMenu() {
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.displayMainMenuView();
    }

}
