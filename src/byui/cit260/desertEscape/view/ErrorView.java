/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertEscape.view;

import desertescape.DesertEscape;
import java.io.PrintWriter;

/**
 *
 * @author NicolasWilliams
 */
public class ErrorView {

    private static final PrintWriter errorFile = DesertEscape.getOutFile();
    private static final PrintWriter logFile = DesertEscape.getLogFile();
    
    public static void display(String className, String errorMessage) {
        errorFile.println(
                "\n*******************************************************"
                + "\n - Error - " + errorMessage
                + "\n*******************************************************");
        
        logFile.println(className + " - " + errorMessage);
    }
}
