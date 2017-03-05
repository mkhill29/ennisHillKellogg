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
            super("\n"
                + "\n------------------------------------"
                + "\n| Antidote Menu                       |"
                + "\n------------------------------------"
                + "\n This is the Antidote Menu"
                + "\n------------------------------------");
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
