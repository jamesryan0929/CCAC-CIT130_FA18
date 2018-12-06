/**
 * August 29 2018
 * 18FA CIT130 Z04B
 * @author James Hayes
 * 
 * This program is a simple inflation calculator
 * 
 */
//package cit130_assignement2;

import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class Cit130_Assignement2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in); 
        
        int currentPrice, numOfYears; 
        double inflationRate, futureCost, inflationConvert, yearsConvert;
        
        
        
        System.out.println("*** Inflation Calculator ***");
        System.out.println("");
       
        // current price input
        System.out.println("Enter the current price of the item:");
        currentPrice = userIn.nextInt();
        
        //inflation rate input
        System.out.println("Enter the current inflation rate.");
        inflationRate = userIn.nextFloat();
        
        //Number of years input 
        System.out.println("Enter the whole number of years for the future projects cost");
        numOfYears = userIn.nextInt();
        
        //converting int values to double values for arthimetic calculations
        inflationConvert = (inflationRate / 100) + 1;
        yearsConvert = numOfYears; 
        
        //arithmetic process
        futureCost = Math.pow(inflationConvert,yearsConvert) * currentPrice;
        
        //creating a decimal format for calculator output
        DecimalFormat df = new DecimalFormat ("###,###.##");
        
        //Calculator Output 
        System.out.println("At a rate of "+ df.format(inflationRate)+ "% per year, the cost in " + numOfYears + " years will be $" + df.format(futureCost) + ".");
            
    }//close main 
}//close class
