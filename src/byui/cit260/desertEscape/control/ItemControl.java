/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertEscape.control;

import byui.cit260.desertEscape.model.Item;
import byui.cit260.desertEscape.model.Location;
import byui.cit260.desertEscape.model.Player;
import java.io.Serializable;

/**
 *
 * @author NicolasWilliams
 */
public class ItemControl implements Serializable {

    public void collectItem(Item item, Player player) {
        player.addItem(item);
    }

    public boolean findItem(Player player) {
        Location location = player.getLocation();
        if (location.getItem() != null) {
            player.addItem(location.getItem());
            location.setItem(null);
            return true;
        }

        return false;
    }
}
