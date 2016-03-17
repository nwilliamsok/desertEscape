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
public class HelpMenuView extends View {

    public HelpMenuView() {
        super("\n                                          "
                + "\n------------------------------------------"
                + "\n |             Help Menu                 |"
                + "\n------------------------------------------"
                + "\n                                          "
                + "\n           S - Storyline                  "
                + "\n           A -   About                    "
                + "\n           M - Main Menu                  "
                + "\n           Q -    Quit                    "
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

}
