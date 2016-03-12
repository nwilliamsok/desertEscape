/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desertescape;

import byui.cit260.desertEscape.model.Caves;
import byui.cit260.desertEscape.model.Desert;
import byui.cit260.desertEscape.model.InventoryItem;
import byui.cit260.desertEscape.model.Options;
import byui.cit260.desertEscape.model.Player;
import byui.cit260.desertEscape.model.Pyramid;
import byui.cit260.desertEscape.model.MainMenu;
import byui.cit260.desertEscape.view.StartProgramView;

/**
 *
 * @author NicolasWilliams
 */
public class DesertEscape {

    /**
     * @param args the command line arguments
     */
    private static Game currentGame = null;
    private static Player player = null;

    public static void main(String[] args) {

        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();

        Caves cavesOne = new Caves();
        Desert desertOne = new Desert();
        Options optionsOne = new Options();
        Player playerOne = new Player();
        Pyramid pyramidOne = new Pyramid();
        MainMenu mainMenuOne = new MainMenu();

        cavesOne.setDescription("This is the Caves description.");
        cavesOne.setAmountRemaining(5);
        cavesOne.setRow(1);
        cavesOne.setColumn(1);
        cavesOne.setResourceGems(5);
        cavesOne.setVisited("No");

        String cavesInfo = cavesOne.toString();
        System.out.println(cavesInfo);

        pyramidOne.setDescription("This is the Pyramid description.");
        pyramidOne.setAmountRemaining(5);
        pyramidOne.setRow(1);
        pyramidOne.setColumn(2);
        pyramidOne.setResourceSchematic(1);
        pyramidOne.setVisited("No");

        String pyramidInfo = pyramidOne.toString();
        System.out.println(pyramidInfo);

        desertOne.setDescription("This is the Desert description.");
        desertOne.setRow(1);
        desertOne.setColumn(3);
        desertOne.setVisited("No");

        String desertInfo = desertOne.toString();
        System.out.println(desertInfo);

        playerOne.setName("Player Name");
        playerOne.setGender("Male");
        playerOne.setBestTime(1.5);

        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);

        optionsOne.setDifficulty(3);
        optionsOne.setSavedGame(3);
        optionsOne.setDescription("This is the Options description.");

        String optionsInfo = optionsOne.toString();
        System.out.println(optionsOne);

        mainMenuOne.setActivePlayer(1);
        mainMenuOne.setDescription("This is the Main Menu description.");

        String mainMenuInfo = mainMenuOne.toString();
        System.out.println(mainMenuInfo);
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        DesertEscape.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        DesertEscape.player = player;
    }

}
