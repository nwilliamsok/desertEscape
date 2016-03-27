/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desertescape;

import byui.cit260.desertEscape.model.Player;
import byui.cit260.desertEscape.view.StartProgramView;
import byui.cit260.desertEscape.view.View;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author NicolasWilliams
 */
public class DesertEscape extends View{

    /**
     * @param args the command line arguments
     */
    private static Game game;
    private static Player player;

    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;

    private static PrintWriter logFile = null;
    

    public static void main(String[] args) {

        DesertEscape.inFile
                = new BufferedReader(new InputStreamReader(System.in));

        DesertEscape.outFile
                = new PrintWriter(System.out, true);
        try {
            String filePath = "log.txt";
            DesertEscape.logFile = new PrintWriter(filePath);
        } catch (Exception e) {
            System.out.println("Exception: " + e.toString()
                    + "\nCause: " + e.getCause()
                    + "\nMessage: " + e.getMessage());

            e.printStackTrace();
        }
        
        
        
        
        StartProgramView startProgramView = new StartProgramView();

        try {
            startProgramView.displayStartProgramView();
        } catch (Throwable e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            startProgramView.displayStartProgramView();
        } finally {
            try {
                if (DesertEscape.inFile != null) 
                    DesertEscape.inFile.close();
                
                if (DesertEscape.outFile != null) 
                    DesertEscape.outFile.close();
                    
                if (DesertEscape.logFile != null) 
                    DesertEscape.logFile.close();
                
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }
        }
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        DesertEscape.logFile = logFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        DesertEscape.outFile = outFile;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        DesertEscape.inFile = inFile;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        DesertEscape.player = player;
    }

    public static Game getGame() {
        return game;
    }

    public static void setGame(Game game) {
        DesertEscape.game = game;
    }

}
