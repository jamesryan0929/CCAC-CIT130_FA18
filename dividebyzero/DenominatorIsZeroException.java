/*
*James Hayes
*CIT 130 Fall 2018
*/
//package dividebyzero;


public class DenominatorIsZeroException extends java.lang.Exception{

    public DenominatorIsZeroException(){
        super("Division by zero is not allowed!!!");
    }

    public DenominatorIsZeroException(String message){
        super(message);
    }
    
}
