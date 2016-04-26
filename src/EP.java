import java.util.*;
/**
 *
 * @author Johnny Flame Lee and Frida Israelsson
 */
public class EP implements ExamPile{

    private List<Integer> pile = new LinkedList<>();
    private int pileSize;
    private int count;
    
    /**
     * Constructor creating a new instance of EP
     */
    
    /**
     * Initializes the pile of exams to consist of the contents of the list
     * provided (the elements of the list represent the exams
     * in order from top to bottom of the pile).
     * @param items
     */
    public void load (List<Integer> items){ //calling a list of type intergers named items
        pile.addAll(items);
    }
    
    /**
     * 
     * @return s the value at the top of the pile
     */
    public int peek(){
        return 0;
    }
    
    public int size(){
     return 0; 
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
        List<Integer>input = new ArrayList<>();
        
        EP newPile = new EP(); //creates a new exampile
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter some numbers");
        
     
        input.add(sc.nextInt());
        
        System.out.println(input);
        
    }
}

