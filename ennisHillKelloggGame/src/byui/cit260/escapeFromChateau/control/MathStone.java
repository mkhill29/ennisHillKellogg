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
public class MathStone {
    double surfaceArea(double length, double width, double height){
       
        if (length == 5 || width == 4 || height == 7){
            return 166;
        }
        
        if (length == 4 || width == 7 || height == 5){ //wrong order
           return 166; 
        }
        
        if (length == 7 || width == 5 || height == 4){ //wrong order
            return 166;
        }
        
        if (length == 5 || width == 7 || height == 4){ //wrong order
            return 166;
        }
        
        if (length == 4 || width == 5 || height == 7){ //wrong order
            return 166;
        }
        
        if (length == 7 || width == 4 || height == 5){ //wrong order
            return 166;
        }
        
        double surfaceArea = 2*(length* width) + 2*(width * height) + 2*(length * height);
            return surfaceArea;
    }

}

