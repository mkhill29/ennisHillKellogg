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
public class RoomMenuView {
    
    private String menu;
    private String promptMessage;
    
    public RoomMenuView(){
        
        this.promptMessage = "\nChoose a menu option";
        //display when view is created
        System.out.println(
                    menu = "\n"
                    + "\n----------------------------------------------------"       
                    + "\n|       Room Menu                                  |"
                    + "\n----------------------------------------------------"
                    + "\nL - Look around (room description and items in room)"
                    + "\nP - Pick up item"
                    + "\nF - See item features"
                    + "\nA - Add item to inventory"
                    + "\nU - Use item"
                    + "\nI - View inventory"
                    + "\nC - Close menu");
        
    }
    
}
