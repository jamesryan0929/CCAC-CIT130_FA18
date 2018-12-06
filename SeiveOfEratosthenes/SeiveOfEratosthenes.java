/*
 *
* package seiveoferatosthenes;
*/
// driver program to test function of PrimeSieve class.

import java.util.Scanner;
public class SeiveOfEratosthenes {

     /*
      * @author james_hayes
      * 18FA CIT130 Z04B
      * 09/18/2018
      */
    
    public static void main(String[] args) {
        
        Scanner userIn = new Scanner(System.in);
        System.out.println("**************");
        System.out.println("Sieve of Eratosthenes");
        System.out.println("**************");
        System.out.println("Enter an integer greater than zero: ");
        
        int sendBound = userIn.nextInt();
        System.out.println("");
        PrimeSieve runSieve = new PrimeSieve();
        runSieve.primeSieve(sendBound);
    }
}