/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertEscape.control;

import byui.cit260.desertEscape.model.InventoryItem;
import byui.cit260.desertEscape.model.Player;
import desertescape.DesertEscape;
import desertescape.Game;
import java.util.Map;

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

    public static void createNewGame(Player player) {
        
        Game game = new Game();
        DesertEscape.setCurrentGame(game);
        
        game.setPlayer(player);
        
        InventoryItem[] inventoryList = GameControl.createInventoryList();
        game.setInventory(inventoryList);
        
        Map Map = MapControl.createMap();
        game.setMap(map);
        
        MapControl.moveCharactersToStartingLocation(map);
    }

    public static InventoryItem[] createInventoryList() {
InventoryItem[] inventory = new InventoryItem[7];
        return inventory;
    }


}
