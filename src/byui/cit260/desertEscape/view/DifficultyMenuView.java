/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertEscape.view;

/**
 *
 * @author NicolasWilliams
 */
public class DifficultyMenuView extends View {

    public DifficultyMenuView() {
        super("\n                                          "
                + "\n--------------------------------------------"
                + "\n|             Difficulty Menu              |"
                + "\n--------------------------------------------"
                + "\n                                            "
                + "\n            E -     Easy                    "
                + "\n            H -     Hard                    "
                + "\n            R -  Ridiculous                 "
                + "\n            Q -     Quit                    "
                + "\n                                            "
                + "\n--------------------------------------------");
    }

    @Override
    public void display() {
        this.console.println("\n" + this.displayMessage);

        boolean done = false;
        do {

            String menuOption = this.getInput();
            if (menuOption.toUpperCase().equals("Q")) {
                return;
            }
            done = this.doAction(menuOption);

        } while (!done);
    }

    @Override
    public String getInput() {

        String value = "";
        boolean valid = false;
        try {
            while (!valid) {
                this.console.println("\nSelect an option");

                value = keyboard.readLine();
                value = value.trim();

                if (value.length() < 1) {
                    ErrorView.display(this.getClass().getName(), "\nInvalid value: value can not be blank");
                    continue;
                }

                break;

            }
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
        }
        return value;

    }

    @Override
    public boolean doAction(String value) {

        try {
            value = value.toUpperCase();

            switch (value) {
                case "E":
                    this.easy();
                    break;
                case "H":
                    this.hard();
                    break;
                case "R":
                    this.ridiculous();
                    break;
                default:
                    ErrorView.display(this.getClass().getName(), "\n*** Invalid Selection *** Try again, It's not that hard.");
                    break;

            }
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(), "Error in DifficultyMenuView" + e.getMessage());
        }
        return true;

    }

    private void easy() {
        this.console.println("\n*** You have chosen the Easy way out. No cudos for you, buddy. ***");

    }

    private void hard() {
        this.console.println("\n*** Obviously this isn't your first Rodeo. ***");

    }

    private void ridiculous() {
        this.console.println("\n*** Don't come crying to me when you've pulled all your hairs out. ***");

    }

}
