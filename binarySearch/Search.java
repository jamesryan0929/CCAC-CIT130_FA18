
/*
James Hayes
CIT130 FA18
Binary Search Program
*/

//package binarysearch;

/*
This is am implementation of a binary search algorithm
*/

public class Search <T extends Comparable<T>>{    
    
    private  T[] a;
    
    public Search(T[]inArray){
        a = inArray;
    }
    
    public int search (T v) {
        int low = 0;
        int high = a.length -1;
        
        while (low <= high){
            int mid = (high+low)/2;
            T midVal = a[mid];
            int result = v.compareTo(midVal);
            
            if (result < 0)
                high = mid-1;            
            else if(result > 0)
                low = mid + 1;
            else
                return mid;
        }
        return -1;
    }//closed int
    
}//close class