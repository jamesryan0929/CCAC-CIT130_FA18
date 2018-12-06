/*
James Hayes
CIT_130
Nov 10 2018
*/
//package standarddeviation;

import java.util.ArrayList;

public class StandardDeviation<T extends Number> {
   
    private double stDev = 0;
    double avg = 0;
    
    public double avg(ArrayList<T> a, double ergoSum){
        avg = ergoSum/a.size();
        return avg;
    }
    
    public double stDev(ArrayList<T> a){
        
        for(T t : a) //squaring Ergosum of variances
            stDev = (stDev + Math.pow((t.doubleValue() - avg), 2));
        
        //stDev = Math.pow(stDev, 2);
        stDev = (stDev / (a.size()-1));
        
        stDev = Math.pow(stDev , 0.5);//square root of sum
        return stDev;
    }
    
}
