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
public class DifficultyMenuView extends View{

    public DifficultyMenuView(){
    super("\n                                          "
                + "\n--------------------------------------------"
                + "\n|             Difficulty Menu              |"
                + "\n--------------------------------------------"
                + "\n                                            "
                + "\n            E -     Easy                    "
                + "\n            H -     Hard                    "
                + "\n            R -  Ridiculous                 "
                + "\n            Q -     Quit                    "
                + "\n                                            "
                + "\n--------------------------------------------");
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
            case "E":
                this.easy();
                break;
            case "H":
                this.hard();
                break;
            case "R":
                this.ridiculous();
            default:
                System.out.println("\n*** Invalid Selection *** Try again, It's not that hard.");
                break;

        }

        return true;

    }

    private void easy() {
        System.out.println("\n*** You have chosen the Easy way out. No cudos for you, buddy. ***");
        OptionsMenuView optionsMenuView = new OptionsMenuView();
        optionsMenuView.display();
    }

    private void hard() {
        System.out.println("\n*** Obviously this isn't your first Rodeo. ***");
        OptionsMenuView optionsMenuView = new OptionsMenuView();
        optionsMenuView.display();
    }

    private void ridiculous() {
        System.out.println("\n*** Don't come crying to me when you've pulled all your hairs out. ***");
        OptionsMenuView optionsMenuView = new OptionsMenuView();
        optionsMenuView.display();
    }

}
