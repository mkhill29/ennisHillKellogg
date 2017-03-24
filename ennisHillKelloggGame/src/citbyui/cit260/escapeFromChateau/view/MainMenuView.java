
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.escapeFromChateau.view;

import byui.cit260.escapeFromChateau.control.GameControl;
import citbyui.cit260.escapeFromChateau.exceptions.MapControlException;
import ennishillkellogggame.EnnisHillKelloggGame;

/**
 * @author Heidi Ennis
 */
public class MainMenuView extends View {

    protected String promptMessage;

    public MainMenuView() {
        super("\n"
                + "\n------------------------------------"
                + "\n| Main Menu                        |"
                + "\n------------------------------------"
                + "\nS - Save"
                + "\nB - Begin New Game"
                + "\nL - Load Saved Game"
                + "\nH - Help"
                + "\nX - Quit"
                + "\n------------------------------------");
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase(); // convert choice to upper case

        switch (value) {
            case "S": // save a game
                this.saveCurrentGame();
                break;
            case "B": // begin new game
                this.beginNewGame();

                break;
            case "L": // load game
                this.loadSavedGame();
                break;
            case "H": // display help menu
                this.displayHelpMenu();
                break;
            default:
                ErrorView.display("MainMenuView",
                        "\n*** Invalid selection *** Try again");
                break;
        }

        return false;
    }

    private void saveCurrentGame() {
        // prompt for and get the name of the file to save the game in
        this.console.println("\n\nEnter the file path for the file where the game "
                               + "is to be saved.");
        String filePath = this.getInput();
        
        try{
            // save the game to the specified file
        GameControl.saveCurrentGame(EnnisHillKelloggGame.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }

    private void beginNewGame() {
        //begin new game
        try {
            GameControl.createNewGame(EnnisHillKelloggGame.getPlayer());
            GameMenuView gameMenu = new GameMenuView();
            gameMenu.display();
            /*BeginNewGame beginNewGame = new BeginNewGame();
            beginNewGame.display();*/
        } catch (MapControlException mce) {
            this.console.println(mce.getMessage());
            return;
        } catch (Throwable te) {
            this.console.println(te.getMessage());
            return;
        } finally {
            this.console.close();
        }
        //display game menu

    }

    private void loadSavedGame() {
        // prompt for and get the name of the file to save the game in
        this.console.println("\n\nEnter the file path for file where the game "
                            + "is saved.");
        
        String filePath = this.getInput();
        
        try{
            //start saved game
            GameControl.loadSavedGame(filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void displayActionMenu() {
        ActionMenuView actionMenu = new ActionMenuView();
        actionMenu.display();
    }

}
