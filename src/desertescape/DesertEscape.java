/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desertescape;

import byui.cit260.desertEscape.model.Caves;

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
        
        cavesOne.setDescription("This is the Description");
        cavesOne.setAmountRemaining(5);
        cavesOne.setRow(3);
        cavesOne.setColumn(3);
        cavesOne.setResourceGems(5);
        cavesOne.setVisited("No");
        
        String cavesInfo = cavesOne.toString();
        System.out.println(cavesInfo);
        
    }
    
}
