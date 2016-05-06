package week09;

import java.util.*;

/**
 * EP. java an implementation of ExamPile.
 * Simulating the behaviour of sorting and marking a pile of exams. 
 * @author Johnny Flame Lee & Frida Israelsson.
 */
public class EP implements ExamPile{

    /** An empty exam pile. */
    private ArrayList<Integer> exams;

    /** The number of exams searched in by marked method. */
    protected static int depth = 1;
     
    /** A default constructor of the pile of exams. */
    public EP(){
        exams = new ArrayList<Integer>();
    }

    /**
     * 
     * Adds a new pile of exams to the existing pile.
     * 
     * @param items a list of integers representing a new pile of exams.
     */
    public void load(List<Integer> items){
        exams.addAll(items);
    }
    
    /**
     * Returns the size of the current exam pile.
     * @return the size of the current pile.
     */
    public int size(){
        return exams.size();
    }
    
    /**
     * Return the value at top of the pile without removing it.
     * @return s the value at the top of the pile.
     */
    public int peek(){
        if (exams.isEmpty()){
            throw new EmptyPileException("No more exams in pile");
        }
        return exams.get(0);
    }
    
    /**
     * Search for input value in the top section of the pile and removes it.
     * Returns -1 if the value is not found.
     *
     * @param depth the number of exams to be accessed from the top of the pile.
     * @param value the target value to search for.
     * @return the target value and removes it from the pile.
     * returns -1 if value is not found within the range. 
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
     * @param count the number of exams to move.
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
     * Sort and mark the exam pile in order.
     * @return steps a String representation of the sortingSteps.
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
     * The main method takes input from user to specify depth.
     * @param args the command line argument specifying depth.
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
