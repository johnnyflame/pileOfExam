import java.util.*;
/**
 *
 * @author Johnny Flame Lee and Frida Israelsson
 */
public class EP implements ExamPile{
     private List<Integer> exams;
     
     public EP(){
         //pile = new Stack();
    }

    /**
     * Initializes the pile of exams to consist of
     * the contents of the list provided (the elements of the list represent the exams
     * in order from top to bottom of the pile).
     * @param items
     */
    public void load(List<Integer> items){
        exams = items;
        System.out.println(exams);
    }
    
    /** ...
     * 
     */
    public int size(){
        int pileSize = 0;
        for(int i:exams){
            pileSize++;
        }
        return pileSize;
    }
    
    /**
     * 
     * @return s the value at the top of the pile
     */
    public int peek(){
        //int top = 
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
        for (int i=0; i<depth; i++){
            //exams.pop();
            
        }
            
        return 0;
    }
    
    /**
     * Moves count values from the top of the pile to the
     * bottom of the pile.
     * @param count 
     */
    public void delay(int count){
        
    }
    
//    public String sortingSteps(){
//        String steps = "";
//        int s = 0;
//        if (exams.peek()==s){
//            exams.mark(1,s);
//        }
//        
//        return steps;
//    }
    
    /**
     * 
     * @param args the command line argument.
     */
    
    public static void main(String[] args) {
        EP pile = new EP(); 
        Stack<Integer> items = new Stack<Integer>();
        
        for(String s: args){
            items.add(Integer.parseInt(s));
        
        }
        pile.load(items);
        
        //System.out.println(pile.peek());

        
    }
    
}
