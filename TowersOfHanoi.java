/*
James Hayes
CIT 130 FA18
Tower of Hanoi
*/
//package towersofhanoi;

import java.util.Scanner;

public class TowersOfHanoi {

 
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        System.out.println("Please enter number of disc");
        int discs = userIn.nextInt();
        
        TowersOfHanoi towersOfHanoi = new TowersOfHanoi();
        towersOfHanoi.solve(discs, "pole 1", "pole 2", "pole 3");
    }
    
    public void solve (int n, String start, String aux, String end){
        if (n==1){
            System.out.println("move disc from " + start + " to "+ end );
        }else{
            solve(n-1, start, end, aux);
            System.out.println("move disc from " + start + " to "+ end );
            solve(n-1, aux, start, end);
        }    
            
    }
    
}
