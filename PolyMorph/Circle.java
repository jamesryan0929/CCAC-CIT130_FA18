/*
 * James Hayes 
 * CIT_130 
 * Assignment 6
 *Polymorphism 
 */
 
//package polymorph;

import java.lang.Math;

public class Circle extends Figure {

    int radius, circum;
    
    public Circle(String n, int a, int b, int r){
        super(a,b,n);
        int c =(int) Math.round(2*Math.PI*r);
        setRadius(r);
        setCircum(c);
    }
    
    public String toString(){
        return "In Circle Drawing " +getName()+ " centered at (" +getX()+ ", " +getY()+ ") radius "
        +getRadius()+" circumfrence "+getCircum();                          
    }
    
    public void erase(){
        System.out.println("In Circle is erasing");
    }
    public void draw(){
        center();
        erase();
        System.out.println(""+this);
    }
    public void setRadius(int r){
        radius=r;
    }
    
    public void setCircum(int c){
        circum=c;
    }
    
    public int getRadius(){
        return radius;
    }
    public int getCircum(){
        return circum;
    }    
}
