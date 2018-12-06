/*
James Hayes
CIT 130 FA18
Counter Project
*/

/*
CounterView contains main()
*/

//package countermodel;

import java.util.Scanner;

public class CounterView {
    
     public static void main(String[] args) {
        
        Scanner userIn = new Scanner(System.in);
        System.out.print("Please enter you start value: ");
        int x = userIn.nextInt();
        System.out.print("Please enter your end value: ");
        int n = userIn.nextInt();
        
        CounterModel counterModel = new CounterModel();
        counterModel.counterModel(n, x);
    }
    
}
