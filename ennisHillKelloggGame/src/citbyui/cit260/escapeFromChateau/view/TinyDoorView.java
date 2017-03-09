/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.escapeFromChateau.view;

import byui.cit260.escapeFromChateau.control.MathTinyDoorControl;
import java.util.Random;
import java.util.Scanner;
import static jdk.nashorn.tools.ShellFunctions.input;

/**
 *
 * @author Kristine Hill
 */
public class TinyDoorView extends View {

    protected final String promptMessage;
    private double minutesPerOunce;
    private double fuelCapacity;
    private double burnTime;

    public TinyDoorView() {
        Random rand = new Random();
        minutesPerOunce = rand.nextInt(10);
        fuelCapacity = rand.nextInt(10);
        burnTime = rand.nextInt(10);
        this.promptMessage = "\n****************************************"
                + "\n You are much too large to pass                    "
                + "\n through me! If you are clever, I may              "
                + "\n reveal to you a secret latch that will            "
                + "\n open a bigger door for you. You must              "
                + "\n answer a tricky question before I tell            "
                + "\n you the secret!                                   "
                + "\n**                                                 "
                + "\nIf your lantern burns one ounce of fuel            "
                + "\n in 20 minutes, and it can hold 24 ounces          "
                + "\n of fuel, how many times will you need to          "
                + "\n fill it to have light for 16 hours?               "
                + "\n***************************************************";
    }
       
   public void displayPromptMessage() {

        boolean correct = false;

        while (!correct) {
            System.out.println("\n" + this.promptMessage);
            String input = this.getInput();

            //do the requested action and display the next view
            correct = this.doAction(input);
            if (!correct) {
                System.out.println("\nIncorrect - TRY AGAIN\n");
            }
        }
    }

    @Override
    public String getInput() {
        Scanner keyboard = new Scanner(System.in); //get infile for Keyboard
        String value = ""; //value to be returned

        value = keyboard.nextLine(); //get next line typed on keyboard
        value = value.trim(); //trim off leading and trailing blanks

        return value; //return entered value

    }

    @Override
    public boolean doAction(String input) {
        double playerAnswer = Double.parseDouble(input);

        MathTinyDoorControl mtdc = new MathTinyDoorControl();
        return mtdc.calcFuelFills(minutesPerOunce, fuelCapacity, burnTime, playerAnswer);
    }
}



    

        
