/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProbeTest2;

import static java.lang.Math.PI;

/**
 *
 * @author thomas.duppenthaler
 */
public class Circle extends Form
{
    private int radius;
private static int counter=0;
   Circle()
   {
       this.counter++;
   }
    Circle(int radius, int x,int y)  //mit Offset
    {
        this.x=x;                //durch protected anwählbar
        this.y=y;
        this.radius=radius;
        this.counter++;
    }
    
    public int getRadius()
    {
        return radius;
    }

    public void setRadius(int radius)
    {
        this.radius = radius;
    }

    public static int getCounter()
    {
        return counter;
    }

    @Override
    public String toString()
    {
        return "Circle{" + "radius=" + radius + '}';
    }

    @Override
    public double getArea()
    {
       return (double) ((this.radius*this.radius)*PI);
    }
    
    
    
}
