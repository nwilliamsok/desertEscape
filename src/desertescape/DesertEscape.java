/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desertescape;

import byui.cit260.desertEscape.model.Player;
import byui.cit260.desertEscape.view.StartProgramView;

/**
 *
 * @author NicolasWilliams
 */
public class DesertEscape {

    /**
     * @param args the command line arguments
     */
    private static Game game;
    private static Player player;

    public static void main(String[] args) {

        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();
    }

     public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        DesertEscape.player = player;
    }

    public static Game getGame() {
        return game;
    }

    public static void setGame(Game game) {
        DesertEscape.game = game;
    }

}
