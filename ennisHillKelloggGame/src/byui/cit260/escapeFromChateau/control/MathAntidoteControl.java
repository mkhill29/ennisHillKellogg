/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromChateau.control;

/**
 *
 * @author Kristine Hill
 */
public class MathAntidoteControl {
    
   double calcHalfVolume(double width,  double length, double height) {
    
       if (width < 0 || width > 99){ //width out of range?
           
           return -1;
       }
       
       if (length < 0 || length > 99){ //length out of range?
           
           return -1;
       }
       
       if (height < 0 || height > 99){ //height out of range?
           
           return -1;
       }
       
       double halfVolume = (width * length * height)/2;
       
            return halfVolume;
   }
}
   
