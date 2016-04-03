/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertEscape.view;

import byui.cit260.desertEscape.control.GameControl;
import byui.cit260.desertEscape.model.Player;

/**
 *
 * @author NicolasWilliams
 */
public class StartProgramView extends View {

    private String promptMessage;

    public StartProgramView() {

        this.promptMessage = "\nPlease Enter Your Name:";
        //display the banner when view is created
        this.displayBanner();

    }

    private void displayBanner() {

        this.console.println(
                "\n*******************************************************"
                + "\n*              Welcome to Desert Escape               *"
                + "\n*                                                     *"
                + "\n*        In this game your wits will be tested        *"
                + "\n*   Your deepest darkest fears will become realized   *"
                + "\n*    As you face an enemy who is more fearsome and    *"
                + "\n*                      Deadly                         *"
                + "\n*       Than any other that you have ever faced       *"
                + "\n*                                                     *"
                + "\n*         You are stranded on a desert planet         *"
                + "\n*                  No, Not Tatooine                   *"
                + "\n*               This one is named Glupk               *"
                + "\n*    Yeah, not NEARLY as cool... We realized this     *"
                + "\n*                                                     *"
                + "\n*     However, you must survive with what little      *"
                + "\n*              Resources you can find                 *"
                + "\n*                                                     *"
                + "\n*                    Good Luck!                       *"
                + "\n*******************************************************"
        );
    }

    public void displayStartProgramView() {

        boolean done = false;
        do {
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q")) {
                return;
            }

            done = this.doAction(playersName);

        } while (!done);

    }

    private String getPlayersName() {
        String value = "";
        boolean valid = false;

        try {
            while (!valid) {
                this.console.println("\n" + this.promptMessage);

                value = keyboard.readLine();
                value = value.trim();

                if (value.length() < 1) {
                    ErrorView.display(this.getClass().getName(), "\nInvalid value: value can not be blank");
                    continue;
                }

                break;

            }
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(), "Error in StartProgramView: " + e.getMessage());
        }
        return value;
    }

    @Override
    public boolean doAction(String playersName) {
        try {
            if (playersName.length() < 2) {
                ErrorView.display(this.getClass().getName(), "\nInvalid players name: " + "The name must be greater than one character in length");
                return false;
            }

            Player player = GameControl.createPlayer(playersName);

            if (player == null) {
                ErrorView.display(this.getClass().getName(), "\nError creating the player.");
                return false;
            }

            this.displayNextView(player);
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(), "Error in StartProgramView" + e.getMessage());
        }
        return true;
    }

    private void displayNextView(Player player) {
        this.console.println("\n------------------------------------------"
                + "\n     **Welcome to the game " + player.getName() + "** "
                + "\n|           Please review the:           |"
                + "\n|              --Storyline--             |"
                + "\n|                    &                   |"
                + "\n|              --About Game--            |"
                + "\n|        Located in the Help Menu        |"
                + "\n|       Before starting a new game       |"
                + "\n------------------------------------------"
        );

        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }

}
