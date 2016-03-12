/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertEscape.view;

import byui.cit260.desertEscape.control.GameControl;
import desertescape.DesertEscape;
import java.util.Scanner;

/**
 *
 * @author NicolasWilliams
 */
public class MainMenuView extends View {

    public MainMenuView() {
        super("\n"
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
                + "\n---------------------------------------");
    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase();

        switch (value) {
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

    public void startNewGame() {
        
        GameControl.createNewGame(DesertEscape.getPlayer());
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void resumeGame() {
        System.out.println("*** resumeGame function called ***");
    }

    private void displayOptionsMenu() {
        OptionsMenuView optionsMenuView = new OptionsMenuView();
        optionsMenuView.display();
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }

}
