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
public class OptionsMenuView extends View {

    

    public OptionsMenuView() {
        super("\n                                          "
                + "\n------------------------------------------"
                + "\n|             Options Menu               |"
                + "\n------------------------------------------"
                + "\n                                          "
                + "\n           D - Difficulty                 "
                + "\n           H -    Help                    "
                + "\n           B -    Back                    "
                + "\n           Q -    Quit                    "
                + "\n                                          "
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
            case "D":
                this.difficulty();
                break;
            case "H":
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
        difficultyMenuView.display();
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }

    private void goBack() {
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }

}
