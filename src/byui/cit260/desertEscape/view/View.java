/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertEscape.view;

import desertescape.DesertEscape;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author NicolasWilliams
 */
public abstract class View implements ViewInterface {

    protected String displayMessage;
    
    protected final BufferedReader keyboard = DesertEscape.getInFile();
    protected final PrintWriter console = DesertEscape.getOutFile();

    public View() {
    }

    public View(String message) {
        this.displayMessage = message;
    }

    @Override
    public void display() {

        boolean done = false;
        do {
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) {
                return;
            }
            done = this.doAction(value);
        } while (!done);
    }

    @Override
    public String getInput() {

        boolean valid = false;
        String value = null;
try {
        while (!valid) {
            this.console.println("\n" + this.displayMessage);
            value = keyboard.readLine();
            value = value.trim();
            if (value.length() < 1) {
                System.out.println("\n*** You must enter a value *** ");
                continue;
            }
            break;
        }
} catch (Exception e) {
    System.out.println("Error reading input: " + e.getMessage());
}
        return value;
    }

    @Override
    public boolean doAction(String value) {
        return true;
    }
}
