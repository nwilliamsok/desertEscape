/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desertescape;

import byui.cit260.desertEscape.model.Caves;
import byui.cit260.desertEscape.model.Desert;
import byui.cit260.desertEscape.model.Inventory;
import byui.cit260.desertEscape.model.Options;
import byui.cit260.desertEscape.model.Player;
import byui.cit260.desertEscape.model.Pyramid;
import byui.cit260.desertEscape.model.Shop;
import byui.cit260.desertEscape.model.MainMenu;

/**
 *
 * @author NicolasWilliams
 */
public class DesertEscape {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Caves cavesOne = new Caves();
        Desert desertOne = new Desert();
        Inventory inventoryOne = new Inventory();
        Options optionsOne = new Options();
        Player playerOne = new Player();
        Pyramid pyramidOne = new Pyramid();
        Shop shopOne = new Shop();
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
        
        
        shopOne.setInventoryType("Inventory Item");
        shopOne.setiQuantity(1);
        shopOne.setShopType("Shop Item");
        shopOne.setsQuantity(5);
        
        String shopInfo = shopOne.toString();
        System.out.println(shopInfo);
        
        
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
    
}
