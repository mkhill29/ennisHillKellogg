/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.escapeFromChateau.view;

/**
 *
 * @author Heidi Ennis
 */
public class StartProgramView {

    private String promptMessage;

    public StartProgramView() {
        //promptMessage = "Please enter your name"
        //display the banner when view is created

        this.promptMessage = "\nPlease enter your name: ";
        //display the banner when view is created
        this.displayBanner();
    }

    private void displayBanner() {

        System.out.println(
                "\n***********************************************************"
                + "\n***********************************************************"
                + "\n* Welcome to our new game!"
                + "In this game you will play a game of fun and action and escape adventure "
                + "You will look for clues and places to let you get to a new place in the "
                + "castel.  You will try to find tools to help you get out of the cell or "
                + "room you are in.  You must find a freind to help you get out and"
                + "You must watch out for the guards that can set you back."
                + "etc"
        );//This welcome screen is just a filler until the team can edit it.  
    }

    public void displayStartProgramView() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   
        System.out.println("\n***displayStartProgram() function called***");
    }
    
    }
    
    

