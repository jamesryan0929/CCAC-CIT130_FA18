/**
 * 09/29/2018
 * 18FA CIT130 Z04B
 * @author James Hayes
 * 
 * This is a CSounter class with a handful of functions. 
 * 
 */
//package cit_130a22;

/**
 *
 * @author james_000
 */

public class Counter{
    
      
    private int c; //private state var
    
    public Counter(){ //default constructor
            this.c = 0;    
    }
    
    public void increase(){ //arb mutator
        c = ++c;
    }
    
    public void decrease(){ //arb mutator
        c = Math.max(--c, 0);
        
    }
    
    public void setCount(int newCount){ //mutator     
            c = newCount;     
    }
    
    public int getCount(){//accessor
        return c; 
    }
    
    @Override
    public String toString(){ //polymorph the toString
        return "the current count is " + c;
    }
    
   
    public boolean equals (Counter f){ //boolean statment to return true/false values. 
        return this.getCount()== f.getCount();
    }
  
}

