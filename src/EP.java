import java.util.*;


/**
 *
 * @author Johnny Flame Lee and Frida Israelsson
 */
public class EP implements ExamPile{
    
    private static final int SIZE = 10;
    List<Integer> pile;
    int count;
    
    
    /**
     * Initializes the pile of exams to consist of the contents of the list
     * provided (the elements of the list represent the exams
     * in order from top to bottom of the pile).
     * @param items
     */
    public void load (List<Integer> items){ //calling a list of type intergers named items.
       
        List<Integer> pile = new ArrayList<integer>();
        
        for (int s: items){
        pile.add(s);
        }
        
    }
    
    /**
     * 
     * @return s the value at the top of the pile
     */
    public int peek(){
        
    }
    
    public int size(){
     return count; 
    }
    /**
     * Returns the given value from the top
     * section of the pile, as specified by depth, and removes it from the pile. Returns
     * -1 if the value is not found.
     * @param depth
     * @param value
     * @return 
     */
    public int mark(int depth, int value){
        
    }
    
    /**
     * Moves count values from the top of the pile to the
     * bottom of the pile.
     * @param count 
     */
    public void delay(int count){
        
    }
    
    
    
    /**
     * 
     * @param args the command line argument.
     */
    
    public static void main(int[] args) {
        
        load(args);
    }
    
}
