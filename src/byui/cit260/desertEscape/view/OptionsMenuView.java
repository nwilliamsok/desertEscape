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
public class OptionsMenuView {

    private String options;

    public OptionsMenuView() {
        this.options = "\n                                          "
                + "\n------------------------------------------"
                + "\n|             Options Menu               |"
                + "\n------------------------------------------"
                + "\n                                          "
                + "\n           D - Difficulty                 "
                + "\n           H -    Help                    "
                + "\n           B -    Back                    "
                + "\n           Q -    Quit                    "
                + "\n                                          "
                + "\n------------------------------------------";
    }

    public void displayOptionsMenuView() {

        System.out.println("\n" + this.options);

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
            case "D":
                this.difficulty();
                break;
            case "A":
                this.displayHelpMenu();
                break;
            case "B":
                this.goBack();
                break;

            default:
                System.out.println("\n*** Invalid Selection *** Try again, It's not that hard.");
                break;

        }

        return true;

    }

    private void difficulty() {
        DifficultyMenuView difficultyMenuView = new DifficultyMenuView();
        difficultyMenuView.displayDifficultyMenuView();
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.displayHelpMenuView();
    }

    private void goBack() {
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.displayMainMenuView();
    }

}
