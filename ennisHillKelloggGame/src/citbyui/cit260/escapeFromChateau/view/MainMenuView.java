/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.escapeFromChateau.view;

import byui.cit260.escapeFromChateau.control.GameControl;
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
                this.startNewGame();

                break;
            case "L": // load game
                this.loadSavedGame();
                break;
            case "H": // display help menu
                this.displayHelpMenu();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }

        return false;
    }

    private void saveCurrentGame() {
        // save current game
        GameControl.saveCurrentGame(EnnisHillKelloggGame.getCurrentGame());
    }

    private void beginNewGame() {
        GameControl.createNewGame(EnnisHillKelloggGame.getPlayer());

        //display game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void loadSavedGame() {
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

    private void startNewGame() {
        StartNewGame startNewGame = new StartNewGame();
        startNewGame.display();

}
}
