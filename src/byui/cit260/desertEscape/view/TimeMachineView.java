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
public class TimeMachineView extends View {

    private String promptMessage;

    public TimeMachineView() {

        this.promptMessage = "\nPlease Enter Your Height(inches) and Weight(lbs):";
        //display the banner when view is created
        this.displayBanner();

    }

    private void displayBanner() {

        this.console.println(
                "\n------------------------------------------"
                + "\n|   Calculate BMI & Build Time Machine   |"
                + "\n------------------------------------------"
        );
    }

    public boolean displayTimeMachineView() throws GameException {

        boolean done = false;
        try {
        while (!done) {
            this.console.println("\n" + this.promptMessage + "\n\nHeight(inches): ");
            double height = this.getHeight();
            this.console.println("\nWeight(lbs): ");
            double weight = this.getWeight();
            double BMI = ObjectiveControl.calcBMI(height,weight); 
            this.console.println("\nYour BMI is :" + BMI + ".");

            if (weight <= 0) {
                this.console.println("The weight must be a number greater than 0.");
                if (height <= 0) {
                    this.console.println("The height must be a number greater than 0.");
                }

            } else {
                done = this.doAction(BMI);
            }
        }
        } catch (Exception e) {
               ErrorView.display(this.getClass().getName(),"Error in TimeMachineView" + e.getMessage());
        }
        return true;
    }

    private double getHeight() {
        double valueHeight;

        valueHeight = getDoubleFromKeyboard();

        return valueHeight;
    }

    private double getWeight() {
        double valueWeight;

        valueWeight = getDoubleFromKeyboard();

        return valueWeight;
    }

    private boolean doAction(double BMI) throws GameException {

        this.console.println(ObjectiveControl.buildTimeMachine(BMI));
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
                       ErrorView.display(this.getClass().getName(),"Please enter a number." + e.getMessage());
                }
            }
        } catch (Exception e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
        return 0;
    }

}
