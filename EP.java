package week09;

import java.util.*;
/**
 *
 * @author Johnny Flame Lee & Frida Israelsson
 */
public class EP implements ExamPile{

    private ArrayList<Integer> exams;

    private int markDepth = 1;

    //private int size;
     
     public EP(){
         exams = new ArrayList<Integer>();
         //size = 0;
    }

    /**
     * Initializes the pile of exams to consist of
     * the contents of the list provided (the elements of the list represent
     * the exams
     * in order from top to bottom of the pile).
     * @param items
     */
    public void load(List<Integer> items){
        exams.addAll(items);
        //System.out.println(exams);
    }
    
    /** ...
     * 


     */
    public int size(){
        return exams.size();
    }
    
    /**
     * 
     * @return s the value at the top of the pile
     */
    public int peek(){
        if (exams.isEmpty()){
            throw new EmptyPileException("No more exanms in pile");
        }
        return exams.get(0);
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
        if (exams.isEmpty()){
            throw new EmptyPileException("No more exanms in pile");
        }
        for (int i=0; i<depth; i++){
            if (exams.get(i)==value){
                return exams.remove(i);
            }
        }
        return -1;
    }
    
    /**
     * Moves count values from the top of the pile to the
     * bottom of the pile.
     * @param count 
     */
    public void delay(int count){
        if (exams.isEmpty()){
            throw new EmptyPileException("No more exanms in pile");
        }
        for (int i=0; i<count; i++){
            exams.add(exams.get(0));
            exams.remove(0);
        }
        
    }
    
    public String sortingSteps(){
        String steps = "";
        int current = 0;
        while(size()!=0){
        if (peek()!=current){
            delay(1);
            steps+='D';
        } else {
            mark(markDepth, current);
            current++;
            steps+='M';
        }
        }
        return steps;
    }


    //public String toString(){
    //return exams.toString();
    //}
    
    /**
     * 
     * @param args the command line argument.
     */
    
    public static void main(String[] args) {
        EP pile = new EP(); 
        List<Integer> items = new ArrayList<Integer>();
        
        //for(String s: args){
        //    items.add(Integer.parseInt(s));
        //}

        markDepth = args;


        
        pile.load(items);
        
        //System.out.println(pile.peek());
        //System.out.println(pile.size());
        //pile.delay(4);
        //System.out.println(pile);
        //System.out.println(pile.mark(4,4));
        //System.out.println(pile);
        System.out.println(pile.sortingSteps());

        
    }
    
}
