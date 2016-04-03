/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertEscape.view;

import byui.cit260.desertEscape.control.ObjectiveControl;
import exceptions.GameException;

/**
 *
 * @author NicolasWilliams
 */
public class FillPitView extends View {

    private String promptMessage;

    public FillPitView() {

        this.promptMessage = "\nPlease Enter the Height, Width, and Length of the pit:";
        //display the banner when view is created
        this.displayBanner();

    }

    private void displayBanner() {

        this.console.println(
                "\n------------------------------------------"
                + "\n|  Calculate Volume of a Pit             |"
                + "\n------------------------------------------"
        );
    }

    public boolean displayFillPitView() throws GameException {

        boolean done = false;
        while (!done) {
            this.console.println("\n" + this.promptMessage + "\n\nHeight: ");

            double height = this.getheight();
            this.console.println("\nWidth: ");
            double width = this.getwidth();
            this.console.println("\nLength:");
            double length = this.getlength();

            if (height <= 0) {
                this.console.println("The height must be a number greater than 0.");
            }
            if (width <= 0) {
                this.console.println("The width must be a number greater than 0.");
            }
            if (length <= 0) {
                this.console.println("The length must be a number greater than 0.");

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

        this.console.println("\n------------------------------------------"
                + "\n|   The volume of the pit is: " + ObjectiveControl.calcVolumeOfPit(height, width, length)
                + "  |"
                + "\n------------------------------------------"
        );
        return true;
    }

    public double getDoubleFromKeyboard() {
        boolean valid = false;
        try {
            while (!valid) {
                String input = keyboard.readLine();
                try {
                    double num = Double.parseDouble(input);
                    return num;
                } catch (Exception e) {
                    ErrorView.display(this.getClass().getName(), "Please enter a number.");
                }
            }
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
        }
        return 0;
    }

}
