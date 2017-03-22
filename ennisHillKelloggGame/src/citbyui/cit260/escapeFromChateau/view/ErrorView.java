/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.escapeFromChateau.view;

import ennishillkellogggame.EnnisHillKelloggGame;
import java.io.PrintWriter;

/**
 *
 * @author Heidi Ennis
 */
public class ErrorView {
        private static final PrintWriter errorFile =  EnnisHillKelloggGame.getOutFile();
        
        public static void display(String className, String errorMessage) {
   
                errorFile.println(
                            "----------------------------------------"
                            + "\n- ERROR - "  + errorMessage
                            + "\n-----------------------------------");
        }
}
