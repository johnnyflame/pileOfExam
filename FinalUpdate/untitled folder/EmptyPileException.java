package week09;



/**
 * EmptyPileException.java
 * Handles exception caused by use trying to access empty file.
 * @author Johnny Flame Lee & Frida Israelsson
 */

public class EmptyPileException extends RuntimeException{

    /**
     * The serial version ID.
     */
    private static final long serialVersionUID = 1;



    /**
     * Throws an error
     * @param message a String of error message.
     */    
    public EmptyPileException(String message){
        super(message);
    }
}

