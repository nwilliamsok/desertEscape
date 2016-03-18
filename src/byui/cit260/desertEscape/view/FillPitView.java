/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertEscape.view;

import byui.cit260.desertEscape.control.ObjectiveControl;
import exceptions.GameException;
import java.util.Scanner;

/**
 *
 * @author NicolasWilliams
 */
public class FillPitView {

    private String promptMessage;

    public FillPitView() {

        this.promptMessage = "\nPlease Enter the Height, Width, and Length of the pit:";
        //display the banner when view is created
        this.displayBanner();

    }

    private void displayBanner() {

        System.out.println(
                "\n*******************************************************"
                + "\n*            Calculate Volume of a Pit                *"
                + "\n*******************************************************"
        );
    }

    public boolean displayFillPitView() throws GameException {

        boolean done = false;
        while (!done) {
            System.out.println("\n" + this.promptMessage + "\n\nHeight: ");

            double height = this.getheight();
            System.out.println("\nWidth: ");
            double width = this.getwidth();
            System.out.println("\nLength:");
            double length = this.getlength();

            if (height <= 0) {
                System.out.println("The height must be a number greater than 0.");
                if (width <= 0) {
                    System.out.println("The width must be a number greater than 0.");
                }
                if (length <= 0) {
                    System.out.println("The length must be a number greater than 0.");
                }
            } else {
                done = this.doAction(height, width, length);
            }
        }
        return true;
    }

    private double getheight() {

        double valueheight;

        valueheight = getDoubleFromKeyboard();

        return valueheight;
    }

    private double getwidth() {
        double valuewidth;

        valuewidth = getDoubleFromKeyboard();

        return valuewidth;
    }

    private double getlength() {
        double valuelength;

        valuelength = getDoubleFromKeyboard();

        return valuelength;
    }

    private boolean doAction(double height, double width, double length) throws GameException {

        System.out.println("\n====================================="
                + "\n|   The volume of the pit is: " + ObjectiveControl.calcVolumeOfPit(height, width, length)
                + "  |"
                + "\n====================================="
        );
        return true;
    }

    public double getDoubleFromKeyboard() {
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;

        while (!valid) {
            String input = keyboard.nextLine();
            try {
                double num = Double.parseDouble(input);
                return num;
            } catch (Exception e) {
                System.out.println("Please enter a number.");
            }
        }

        return 0;
    }

}
