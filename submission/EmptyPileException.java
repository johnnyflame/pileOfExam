package week09;



/**
 * EmptyPileException.java.
 * Handles exception caused by user trying to access an empty pile.
 * @author Johnny Flame Lee & Frida Israelsson
 */

public class EmptyPileException extends RuntimeException{

    /**
     * The serial version ID, an arbitory number to stop the compiler warning.
     */
    private static final long serialVersionUID = 1;



    /**
     * Throws an error message when an exception occurs. 
     * @param message a String of error message.
     */    
    public EmptyPileException(String message){
        super(message);
    }
}

