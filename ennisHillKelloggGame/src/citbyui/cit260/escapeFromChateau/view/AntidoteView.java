/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.escapeFromChateau.view;

/**
 *
 * @author Kristine Hill
 */
public class AntidoteView extends View{
    
    public AntidoteView(){
            super("\n************************************************"
                + "\nOh no! You are shrinking! The bottle of         "
                + "\nmysterious liquid contained poison. You will    "
                + "\ndisappear and die unless you can quickly figure "
                + "\nthe volume of water required to fill the room   "
                + "\nhalf full.                                      "
                + "\nThe formula is 1/2 Volume = width X height/2.   "
                + "\nYou have 3 minutes.                             "
                + "\n************************************************");
            
            
    }
    
      @Override
    public boolean doAction(String value) {
        value = value.toUpperCase(); // convert choice to upper case

        switch (value) {
           //TO DO Put a case switch statement here
            
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }

        return false;
    }

}
