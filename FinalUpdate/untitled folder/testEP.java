package week09;

import java.util.*;
import java.io.*;

/**
 * testEP.java
 * A class written to test EP's behaviour against piles of various parameters.
 * @author Frida Israelsson & Johnny Flame Lee.
 */
public class testEP{
    /**
     * @param args numbers to initialise the pile length,depth and trial size.
     */
    public static void main(String[] args){
        int pileLength = 0;
        int testDepth = 0;
        int nrOfPiles = 0;

        if (args.length==3){
            pileLength = Integer.parseInt(args[0]);
            testDepth = Integer.parseInt(args[1]);
            nrOfPiles = Integer.parseInt(args[2]);
                    
	    createPiles(nrOfPiles, pileLength);
	    createSortingSteps(testDepth);
	    System.out.println("Pile length: "+pileLength+"\nMarking depth: "+testDepth+
			       "\nTrials run: "+nrOfPiles+"\nAverage sorting steps: "
			       +calcAverage(nrOfPiles));
	} else {
	    System.out.println ("Please enter pile length, test depth and number of trials.");
	}
    }
    
    /**
     * Creates a randomly permutated piles of exams in a text file.
     * @param nrOfPiles the total number of piles to create for testing.
     * @param pileLength the length of each pile.
     */
    public static void createPiles(int nrOfPiles, int pileLength){
	try{
	    PrintWriter pw = new PrintWriter(new FileWriter("testpiles.txt"));        
	    Random rnd = new Random();
	    for(int n=0; n<nrOfPiles; n++){
		String examP = "";
		ArrayList<Integer> values = new ArrayList<Integer>();
		for (int i=0; i<pileLength; i++){
		    values.add(i);
		}
		while(!values.isEmpty()){
		    examP+=(values.remove(rnd.nextInt(values.size())))+" ";
		}
		pw.println(examP);
	    }
	    pw.close();
	} catch (IOException e) {
	    System.out.println("Cannot write to file.");
	}
    }

    /**
     *
     *
     */
    public static void createSortingSteps(int testDepth){
	try{
	    Scanner scn1 = new Scanner(new File("testpiles.txt"));
	    PrintWriter p = new PrintWriter(new FileWriter("teststeps.txt"));
	    EP tester = new EP();
	    EP.depth = testDepth;
	    while (scn1.hasNext()){
		List<Integer> items = new ArrayList<Integer>();
		Scanner line = new Scanner(scn1.nextLine());
		while (line.hasNext()){
		    items.add(line.nextInt());
		}
		tester.load(items);
		p.println(tester.sortingSteps());
	    }
	    p.close();
	} catch (IOException e) {
	    System.out.println("Cannot write to file.");
	}
    }

    /**
     * Calculates the average steps it takes to sort and mark the pile.
     * @param nrOfPiles the number of piles.
     * @return the steps it takes the sort and mark the piles.
     */
    public static int calcAverage(int nrOfPiles){
	int averageSteps = 0;
	int nrSteps = 0;
	try{
	    Scanner scn2 = new Scanner(new File("teststeps.txt"));
	    while (scn2.hasNext()){
		String pile = scn2.nextLine();
		nrSteps += pile.length();
	    }
	    averageSteps = nrSteps/nrOfPiles;
	} catch (IOException e) {
	    System.out.println("Cannot read file.");
	}
	return averageSteps;
    }
}

