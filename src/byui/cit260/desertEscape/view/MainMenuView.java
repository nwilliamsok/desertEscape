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
public class MainMenuView {

    private String menu;

    public MainMenuView() {
        this.menu = "\n"
                + "\n---------------------------------------"
                + "\n|              Main Menu              |"
                + "\n---------------------------------------"
                + "\n                                       "
                + "\n      N -      New Game                "
                + "\n      R -  Resume Saved Game           "
                + "\n      O -      Options                 "
                + "\n      H -        Help                  "
                + "\n      Q -        Quit                  "
                + "\n                                       "
                + "\n---------------------------------------";
    }

    public void displayMainMenuView() {

        System.out.println("\n" + this.menu);

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
            case "N":
                this.startNewGame();
                break;
            case "R":
                this.resumeGame();
                break;
            case "O":
                this.displayOptionsMenu();
                break;
            case "H":
                this.displayHelpMenu();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try again, It's not that hard.");
                break;

        }

        return true;

    }

    private void startNewGame() {
        System.out.println("*** startNewGame function called ***");
    }

    private void resumeGame() {
        System.out.println("*** resumeGame function called ***");
    }

    private void displayOptionsMenu() {
        OptionsMenuView optionsMenuView = new OptionsMenuView();
        optionsMenuView.displayOptionsMenuView();
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.displayHelpMenuView();
    }

}
