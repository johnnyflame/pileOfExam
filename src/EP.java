import java.util.*;
import java.util.Scanner;


/**
 *
 * @author Johnny Flame Lee and Frida Israelsson
 */
public class EP implements ExamPile{
   
    private int count;
    private List<Integer> pile;
    
    
    /**
     * Constructor creating a new instance of EP
     */
    public EP(){
       pile = new Stack();
    }
    
    /**
     * Initializes the pile of exams to consist of the contents of the list
     * provided (the elements of the list represent the exams
     * in order from top to bottom of the pile).
     * @param items
     */
    public void load (List<Integer> items){ //calling a list of type intergers named items.
       
        for (int s: items){
        pile.add(s);
        }
        
    }
    
    /**
     * 
     * @return s the value at the top of the pile
     */
    public int peek(){
        return 0;
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
        return 0;
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
    
    public static void main(String [] args) {
        
    /* what if we load the input from main args into an array/arrayList first before passing it to Load? */
    EP newExamPile = new EP();
    Scanner sc = new Scanner(System.in);
    List<Integer>input = new ArrayList();
    
    while (sc.hasNext()){
        input.add(sc.nextInt());
    }
    
    
    newExamPile.load(input);
    }
    
}
