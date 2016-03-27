/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertEscape.view;

import byui.cit260.desertEscape.control.GameControl;
import desertescape.DesertEscape;

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
                + "\n      S -     Save Game                "
                + "\n      R -    Resume Game               "
                + "\n      O -      Options                 "
                + "\n      H -        Help                  "
                + "\n      Q -        Quit                  "
                + "\n                                       "
                + "\n---------------------------------------");
    }

    @Override
    public boolean doAction(String value) {

        try {
            value = value.toUpperCase();

            switch (value) {
                case "N":
                    this.newGame();
                    break;
                case "S":
                    this.saveGame();
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
                case "Q":
                    return false;
                default:
                    ErrorView.display(this.getClass().getName(), "\n*** Invalid Selection *** Try again, It's not that hard.");
                    break;

            }
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(), "Error in MainMenuView" + e.getMessage());
        }
        return false;

    }

    public void newGame() {

        GameControl.createNewGame(DesertEscape.getPlayer());
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void resumeGame() {
        this.console.println("\n\nEnter the file path for file where the game is saved");
        String filePath = this.getInput();

        try {
            GameControl.resumeGame(filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void displayOptionsMenu() {
        OptionsMenuView optionsMenuView = new OptionsMenuView();
        optionsMenuView.display();
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }

    private void saveGame() {
        console.println("Enter file name: ");
        try {
            String fileName = keyboard.readLine();
            GameControl.saveGame(fileName);
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(), "Error on input");
        }
    }
      
   
      

      

}
