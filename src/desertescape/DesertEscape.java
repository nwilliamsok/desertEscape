/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desertescape;

import byui.cit260.desertEscape.model.Caves;

/**
 *
 * @author Austin
 */
public class DesertEscape {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Caves cavesOne = new Caves();
      
      cavesOne.setDescription("This is the Description");
      cavesOne.setVisited(0);
      cavesOne.setAmountRemaining(5);
      cavesOne.setColumn(3);
      cavesOne.setRow(4);
      cavesOne.setResourceGems(4);
     
     String cavesInfo = cavesOne.toString();
     System.out.println(cavesInfo);
    }
    
}
