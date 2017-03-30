/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.escapeFromChateau.view;

import byui.cit260.escapeFromChateau.model.Item;
import ennishillkellogggame.EnnisHillKelloggGame;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;

/**
 *
 * @author amikellogg
 */
public abstract class View implements ViewInterface {

    protected String displayMessage;

    protected final BufferedReader keyboard = EnnisHillKelloggGame.getInFile();
    protected final PrintWriter console = EnnisHillKelloggGame.getOutFile();

    public View() {

    }

    public View(String message) {

        this.displayMessage = message;

    }

    @Override

    public void display() {

        boolean done = false; // set flag to not done
        do {
            // prompt for and get players name***  don't need player's name for action menu
            String value = this.getInput();
            if (value.toUpperCase().equals("X")) // user wants to quit
            {
                return; // exit the game
            }
            // do requested action and display the next view
            done = this.doAction(value);

        } while (!done);

    }

    @Override
    public String getInput() {

        String input = null;
        boolean valid = false;

        while (!valid) {

            try {
                //prompt for player input
                this.console.println(this.displayMessage);

                input = this.keyboard.readLine();
                input = input.trim();

                if (input.length() < 1) {
                    this.console.println("\nInvalid value: value can not be blank");
                }

                break;
            } catch (IOException ex) {
                Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return input;
    }

    public void printReport() {
        Scanner in = new Scanner(System.in);
        String fileName = "";
        String pathName = "";
        while (fileName.length() < 2) {
            System.out.println("Please enter your file name here: ");
            fileName = in.nextLine();
            System.out.println("Please enter your file path here: ");
            pathName = in.nextLine();

            if (fileName.length() < 2) {
                System.out.println("Please enter a file name with at least two characters");

            }
            try {

                actuallyPrintTheReport(fileName, pathName);

            } catch (IOException e) {

            }
        }
    }

    public void actuallyPrintTheReport(String fileName, String pathName) throws IOException {
        String fileToBeWritten = pathName + fileName;

        try {
            FileWriter writer = new FileWriter(fileToBeWritten);

            InventoryView inventoryView = new InventoryView();
            List<Item> itemList = inventoryView.createListOfItems();

            for (Item abc : itemList) {
                writer.write(abc.getItem().toString());
            }
            writer.close();
        } catch (Exception e) {

        }

        String fileToBeRead = pathName + fileName;
        FileReader fr = new FileReader(fileToBeRead);
        char[] a = new char[50];
        fr.read(a);   // reads the content to the array

        for (char c : a) {
            System.out.print(c);   // prints the characters one by one
        }
        fr.close();
    }

}
