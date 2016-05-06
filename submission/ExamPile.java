package week09;
import java.util.*;

/**
 * ExamPile.java 
 * A stack-like interface representing a pile of exams.
 * @author Frida Israelsson & Johnny Flame Lee.
 */
public interface ExamPile {
 
    /**
     * 
     * Adds a new pile of exams to the existing pile.
     * 
     * @param items a list of integers representing a new pile of exams.
     */
    public void load (List<Integer> items);
     
    /**
     * Return value without removing.
     * @return s the value at the top of the pile.
     */
    public int peek();
    
    /**
     * Returns the given value from the top section of the pile and removes it
     * from the pile.
     * Returns -1 if the value is not found.
     *
     * @param depth the number of exams to be accessed from the top of the pile.
     * @param value the target value to search for.
     * @return the target value and removes it from the pile.
     * returns -1 if value is not found within the range. 
     */
    public int mark(int depth, int value);
     
    /**
     * Moves count values from the top of the pile to the
     * bottom of the pile.
     * @param count the number of exams to move.
     */
    public void delay(int count);
}

