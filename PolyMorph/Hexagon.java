/*
 * James Hayes 
 * CIT_130 
 * Assignment 6
 *Polymorphism 
 */
 
//package polymorph;

public class Hexagon extends Figure{
    int width, height;
    
    public Hexagon(String n, int a, int b, int w, int h){
        super(a,b,n);
        setWidth(w);
        setHeight(h);
    }
    
    public String toString(){
        return "In Hexagon Drawing " +getName()+ " centered at (" +getX()+ ", " +getY()+ ") width "
        +getWidth()+" height "+getHeight();                          
    }
    
    public void erase(){
        System.out.println("In Hexagon is erasing");
    }
    public void draw(){
        center();
        erase();
        System.out.println(""+this);
    }
    public void setWidth(int w){
        width=w;
    }
    
    public void setHeight(int h){
        height=h;
    }
    
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
}

