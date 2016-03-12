/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertEscape.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author NicolasWilliams
 */
public class Location implements Serializable{
    
    private int row;
    private int column;
    private boolean visited;
    private Scene scene;
    private ArrayList<Character> characters;
    
}
