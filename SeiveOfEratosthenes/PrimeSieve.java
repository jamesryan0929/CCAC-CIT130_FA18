/*
 * package seiveoferatosthenes;
 *
 * @author james_hayes
 * 18FA CIT130 Z04B
 * 09/18/2018
 *
 * This program is an applies the Sieve of Erathostenes to mark of prime numbers less than a given number.
 */
public class PrimeSieve {
    
    public void primeSieve(int upperBound){
        
        //initiate a number array where true is prime
        boolean[] isPrime = new boolean [upperBound + 1];
        
        //assume all integers are prime initially
        for (int i = 2; i < isPrime.length; i++){
            isPrime[i] = true;            
        }
        //check every number >=2 for primality
        //two is the initial prime number so this where we will begin.
        int num = 2;
        
        while (true){                                 
            //mark off multiples of prime number
            for (int i=2; ;i++){ 
                int multiple = num * i;
                if (multiple > upperBound){
                    break;
                }else{
                    isPrime[multiple] = false;
                }
            }
            
           //locate next prime number
            boolean nextNumFound = false;            
            for (int i = num + 1; i < upperBound + 1; i++){
                if (isPrime[i]){
                    num = i;
                    nextNumFound = true;
                    break;                            
                }
            }
            if (!nextNumFound){ //if all numbers in array have been checked terminate 
                break;
            }
        
        }//end while loop

        //display prime numbers
        System.out.println("Prime numbers equal to or less than " + upperBound + " are... ");                

        for (int i = 0; i < isPrime.length; i++){
            if (isPrime[i]){            
                String output = (i + " ");
                System.out.println(output);
                
            }//close if
        }//close for
    }//close method      
}//close class