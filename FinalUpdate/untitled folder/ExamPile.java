package week09;
import java.util.*;

/**
 * ExamPile.java 
 * A stack-like interface representing a pile of exams.
 * @author Frida Israelsson & Johnny Flame Lee.
 */

public interface ExamPile {
public void load (List<Integer> items);
public int peek();
public int mark(int depth, int value);
public void delay(int count);
}

