/*
*James Hayes
*CIT 130 Fall 2018
*/

//This package is a demonstration of catch/throw phrases and exception handling
 
//package dividebyzero;

import java.util.Scanner;

public class DivideByZero {

    
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        int num, den;        
        den = 0;
        while(den==0){
            try{
                System.out.print("Please enter a numerator: ");
                num = userIn.nextInt();
                System.out.print("Please enter a denominator: ");
                den = userIn.nextInt();

                if(den ==0)
                    throw new DenominatorIsZeroException();

                double quotient = num/(double)den;
                System.out.println("Your fraction entered is: " + num + "/" + den);
                System.out.println("= " + quotient);

            }catch(DenominatorIsZeroException e){
               System.out.println(e.getMessage());
               System.out.println("Try again!");
           }
        }
    }
    
    
}
