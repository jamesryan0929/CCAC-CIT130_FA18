//package birthdayParadox;

/*
    This program generates a given number of random list of birthdays of a given size, 
    and checks for duplicate birthdays in any given list. The birthday paradox test for
    the given probability that at least two people with in this list share a common birthday.
    If any birthday is shared then it will return as a single match even if more than one
    birthday is matched. Each test can only return, true or false. Then the number of
    true can be divided by the number of test complete to determine the probability
    of this particular outcome. 

    James Hayes
    CIT_130 FA18
*/

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class BirthdayParadox {

    public static Random randInt = new Random();
    
    public static void main(String[] args) {        
        
        Scanner userIn = new Scanner(System.in);        
        //Set testing parameters here
        System.out.print("Please enter number of trials: ");
        int noTest = userIn.nextInt();
        System.out.print("Please enter n-size of each trial: ");
        final int sizeN = userIn.nextInt();
        System.out.println("");
        int count = 0; //count will be number of trials with atleast one set of matching birthdays

        for (int i = 2; i<=noTest; i++){                        
            for (int trial = 1; trial <= sizeN; trial++);{                
                if (doSingleTrial(sizeN)){
                    count++;
                }
            }//close inner for()
            
        }//close outter for()
        System.out.println("Probability of at least 2 people sharing \nthe same birthday in " +noTest+ " groups of " + sizeN + 
                        " people is " + probability(count, noTest));        
    }//close main()    
        
    //Check single group for matching any matching birthdays
    public static boolean doSingleTrial(int sizeN){      
        HashSet<Integer> bDaySet = new HashSet<Integer>();
        int randDay;            
        for (int i = 1; i < sizeN; i++){
            randDay = randInt.nextInt(365);            
            if (bDaySet.contains(randDay)){               
                return true;
            }else{
                bDaySet.add(randDay);
            }
        }//close for()
        return false;
    }//close doSingleTrial()
    
    //determine the probability of results
    public static double probability (int counter, int noOfTrials){
        double prob = (double) counter/ (double) noOfTrials;
        return prob;
    }
}
