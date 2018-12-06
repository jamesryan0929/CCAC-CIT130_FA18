/**
 * 09/29/2018
 * 18FA CIT130 Z04B
 * @author James Hayes
 * 
 * //this is a main() class to test the functions of my counter class.
 * 
 */
// package cit_130a22;

public class CIT130_Assignement22 {

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
        
        
        //create two instances of counter class object.
        Counter c1 = new Counter(), c2 = new Counter();
        
        //show a list of initial values of each instance.
        System.out.println("Initial State: ");
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c1 == c2 is " + c1.equals(c2));        
        System.out.println("");
        
        
        
        if (c1.equals(c2)){ //test the use of boolean statement incorporated in counter class
            
            c1.increase(); //increase value of an instance by one integer.
            c2.decrease(); // decrease value of an instance by one integer with a minimum value of 0.
            
            
            System.out.println("Error, attempted to subtract "
                    + c1.getCount() +" widgets from " + c2.getCount() + " widgets."); //displaying int value associated with each instance.
            System.out.println("Counters have been reset.");
            
            c1.setCount(4); //mutate counter to test ability to manually set int-values.
            c2.setCount(1);
        }
        
        
        //A series of test and comparisons of counter values, checking for equal and do not equal.
       
        System.out.println("");
        System.out.println("State after Test 1");
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c1 == c2 is " + c1.equals(c2));
                
        //mutate integers
        c1.decrease();
        c2.increase();
        c2.increase();
        
        //test again 
        System.out.println("");
        System.out.println("State after Test 2");
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c1 == c2 is " + c1.equals(c2));
        
    }
    
}
