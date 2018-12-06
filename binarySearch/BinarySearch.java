/*
James Hayes
CIT130 FA18
Binary Search Program
*/

//package binarysearch;
 
/**
This program tests the binary search algorithm found in Search.java.
 */

import java.util.Scanner;
public class BinarySearch {
 
    public static void main(String[] args) {
        
        Scanner userIn = new Scanner(System.in);
        Integer[] numbers = {-2, 0, 2, 4, 6, 8, 10, 12, 14, 16};
        
        
        System.out.println("Integer test array contains...");
        for (int i = 0; i < numbers.length; i++)
            System.out.print(numbers[i] + " ");
        System.out.println();
        System.out.println();
        
        
        Search<Integer> search = new Search<Integer>(numbers);
        
        Integer result;
        
        for(int key = -3; key <= numbers.length; key++){
            result = search.search(key);
            
            if (result >= 0)           
                System.out.println(key + " is at index " + result);
            else                 
                System.out.println(key + " is not in the array");

            
        }    
        
        System.out.println("");
        String[] string = {"September", "April", "February", "October"};
        System.out.println("String Array contains: ");
        for(int i=0; i<string.length; i++)
            System.out.print(string[i] + ", ");
        Search<String> wordSearch = new Search<String>(string);
        
        System.out.println("");
        System.out.println("");
        
        String stKey = "April";
        int index = -1;
        
        while(index <= 0){            
            result = wordSearch.search(stKey);
            System.out.println("Checking for: " + stKey);
            if (result >= 0)
                System.out.println(stKey + " is at index " + result);
            else
                System.out.println(stKey + " is not in the array");
           
            System.out.println("");
            stKey = "December";
            index = index + 1;
        }    
            
    }
} 