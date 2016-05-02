package week09;

import java.util.*;

/**
 *
 * @author Johnny Flame Lee & Frida Israelsson
 */
public class EP implements ExamPile{

    /** */
    private ArrayList<Integer> exams;

    /** */
    protected static int depth = 1;
     
    /** */
    public EP(){
        exams = new ArrayList<Integer>();
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
    }
    
    /**
     *
     * @return ..
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
            throw new EmptyPileException("No more exams in pile");
        }
        return exams.get(0);
    }
    
    /**
     * Returns the given value from the top
     * section of the pile, as specified by depth, and removes it from the
     * pile. Returns -1 if the value is not found.
     * @param depth
     * @param value
     * @return ..
     */
    public int mark(int depth, int value){
        if (exams.isEmpty()){
            throw new EmptyPileException("No more exams in pile");
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
            throw new EmptyPileException("No more exams in pile");
        }
        for (int i=0; i<count; i++){
            exams.add(exams.remove(0));
        }
    }

    /**
     *
     * @return
     */
    public String sortingSteps(){
        String steps = "";
        int current = 0;
        while(size()!=0){
            if (mark(depth, current)==-1){
                delay(depth);
                steps+='D';
            } else {
                current++;
                steps+='M';
            }
        }
        return steps;
    }

    /**
     * 
     * @param args the command line argument.
     */    
    public static void main(String[] args) {        
        EP pile = new EP();
        if (args.length!=0){
            depth = Integer.parseInt(args[0]);
        }
        Scanner scn = new Scanner(System.in);
        while (scn.hasNext()){
                List<Integer> items = new ArrayList<Integer>();
                Scanner line = new Scanner(scn.nextLine());
                while (line.hasNext()){
                    items.add(line.nextInt());
                }
                pile.load(items);
                System.out.println(pile.sortingSteps());
            }
    }
}
