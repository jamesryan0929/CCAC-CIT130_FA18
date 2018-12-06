/*
James Hayes
CIT 130 FA18
Counter Project
*/

/*
CounterView contains main()
*/
//package countermodel;

public class CounterController extends Thread {
    
    public int n;
    public void counterController (int startValue, int endValue){
  
        if(startValue == endValue){
            n = startValue;
            increment();
            System.out.println(n + "....");
        }else{
            counterController(startValue-1, endValue);
            n = startValue;
            increment();
            System.out.println(n + "....");
        }
    }
    
    public void increment(){
       try{
           Thread.sleep(1000);
       }catch(Exception e){
           System.out.println("ERROR: " + e);       
       }
    }   
}
