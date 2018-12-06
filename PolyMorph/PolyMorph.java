/*
 * James Hayes 
 * CIT_130 
 * Assignment 6
 *Polymorphism 
 */

// package polymorph;

/**
 *
 * @author james_000
 */

import java.util.Random;

public class PolyMorph {

    public static void main(String[] args) {
        
        Random rand = new Random();
        Figure []f;
        
        int a,b,w,h,r;
        String name;
        
        f = new Figure[11];
        for (int i=0; i<11; i++){
            //gemerate rand numbers for hex
            a = rand.nextInt(100);
            b = rand.nextInt(100);
            w = rand.nextInt(100);
            h = rand.nextInt(100);
            name = "Hex " + i;
            Hexagon hex = new Hexagon(name, a,b,w,h);
            f[i] = hex;
            f[i].draw();
           
            //generate new rand numbers for rec
            a = rand.nextInt(100);
            b = rand.nextInt(100);
            w = rand.nextInt(100);
            h = rand.nextInt(100);
            name = "Rect " + i;
            Rectanlge rect = new Rectanlge(name,a,b,w,h);
            f[i] = rect;
            f[i].draw();
            
            //generate new rand numbers for circle
            a = rand.nextInt(100);
            b = rand.nextInt(100);
            r = rand.nextInt(100);
            h = rand.nextInt(100);
            name = "Circle " + i;
            Circle circ = new Circle(name,a,b,r);
            f[i] = circ;
            f[i].draw();
        }
    }
    
}
