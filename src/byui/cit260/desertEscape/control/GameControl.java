/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertEscape.control;

import byui.cit260.desertEscape.model.Player;
import desertescape.DesertEscape;

/**
 *
 * @author NicolasWilliams
 */
public class GameControl {

    public static Player createPlayer(String name) {
        if (name == null) {
            return null;
        }

        Player player = new Player();
        player.setName(name);

        DesertEscape.setPlayer(player);

        return player;
    }

}
