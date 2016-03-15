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
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author NicolasWilliams
 */
public class GameControl implements Serializable {

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

        Game g = new Game();
        g.setPlayer(player);

        Map gameMap = new Map();
        g.setMap(gameMap);

        setCharacterLocations(gameMap);

        Player.setLocation(gameMap.getLocation(0, 0));
        DesertEscape.setGame(g);
    }

    public static List<Character> createCharacterList() {
        List<Character> characterList = new ArrayList<>();

        Character Joe = new Character();
        Joe.setName("Joe");
        Joe.setDescription("He is strong.");
        characterList.add(Joe);

        Character Matt = new Character();
        Matt.setName("Matt");
        Matt.setDescription("He is brave.");
        characterList.add(Matt);

        Character Ben = new Character();
        Ben.setName("Ben");
        Ben.setDescription("He is smart.");
        characterList.add(Ben);

        Character John = new Character();
        John.setName("John");
        John.setDescription("He is quick.");
        characterList.add(John);

        Character Tom = new Character();
        Tom.setName("Tom");
        Tom.setDescription("He was just an example and was meant to be deleted from the game before the final release.");
        characterList.add(Tom);

        Character Samantha = new Character();
        Samantha.setName("Samantha");
        Samantha.setDescription("She is a woman.");
        characterList.add(Samantha);

        Character Gary = new Character();
        Gary.setName("Gary");
        Gary.setDescription("He is also a woman...");
        characterList.add(Gary);

        Character Player1 = new Character();
        Player1.setName("Player1");
        Player1.setDescription("Player1 is not even a real person and did not even deserve a name.");
        characterList.add(Player1);

        Character ThePlayerFormerlyKnownAsMousecop = new Character();
        ThePlayerFormerlyKnownAsMousecop.setName("ThePlayerFormerlyKnownAsMousecop");
        ThePlayerFormerlyKnownAsMousecop.setDescription("University of Missouri, Columbia.");
        characterList.add(ThePlayerFormerlyKnownAsMousecop);

        return characterList;
    }

    public static void setCharacterLocations(Map gameMap) {
        List<Character> characters = createCharacterList();
        boolean success = false;

        for (Character c : characters) {
            do {
                int row = (int) (Math.random() * Map.NUM_ROWS);
                int col = (int) (Math.random() * Map.NUM_COLS);

                success = false;
                if (map.getLocation(row, col).getCharacter == null) {
                    map.getLocation(row, col).setCharacter(c);
                    success = true;
                }

            } while (success == false);
        }
    }

}
