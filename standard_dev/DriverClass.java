/*
James Hayes
CIT_130
Nov 10 2018
*/
//package standarddeviation;

import java.util.ArrayList;

public class DriverClass {
    
    public static void main(String[] args) {
        
        double stDev = 0;
        double ergoSum = 0;
        
        //Doubles
        ArrayList<Double> dArray = new ArrayList<Double>();
        for (int i = 1; i<=10;i++){
            double y = i;
            dArray.add(y);
            ergoSum = ergoSum + y;
        }
        
        StandardDeviation<Double> stDevDbl = new StandardDeviation<Double>();
        double dblAvg = stDevDbl.avg(dArray, ergoSum);
        stDev = stDevDbl.stDev(dArray);
        
        System.out.print("Double List: ");
        System.out.println("");
        System.out.println(dArray.toString() + " ");
        System.out.println("Double Average: " + dblAvg);
        System.out.println("standard deviation: " + stDev);
        System.out.println("");
        System.out.println("standard deviation found in assingment description was incorrect -");
        System.out.println("TI84 gives a value of 3.0276503540975.");
        System.out.println("");
        ergoSum = 0; //reset ergoSum
        
        //Integers
        ArrayList<Integer> intArray = new ArrayList<Integer>();
        for (int i =0; i<=9; i++){
            int x = i*(i+1)- (i*i*-1);
            intArray.add(new Integer(x));
            ergoSum = ergoSum + x;
            }
        StandardDeviation<Integer> stDevInt = new StandardDeviation<Integer>();
        double intAvg = stDevInt.avg(intArray, ergoSum);
        stDev = stDevInt.stDev(intArray);
        
        System.out.println("Integer List: "); 
        System.out.println(intArray.toString() + " ");
        System.out.println("Average: " + intAvg);
        System.out.println("Standard Deviation: " + stDev);    
    }
    
}
