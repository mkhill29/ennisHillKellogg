/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromChateau.exceptions;

/**
 *
 * @author Daniel
 */
public class AntidoteException extends Exception {

    public AntidoteException() {
    }

    public AntidoteException(String message) {
        super(message);
    }

    public AntidoteException(String message, Throwable cause) {
        super(message, cause);
    }

    public AntidoteException(Throwable cause) {
        super(cause);
    }

    public AntidoteException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
