/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_modulabschluss_vorbereitung;

import static java.lang.Math.PI;

/**
 *
 * @author simon.zeltner
 */
public class Circle extends Form
{
    private int radius;
    private static int counter = 1;

    //DefaultKonstruktor
    Circle()
    {
        this.counter = this.counter++;

    }

   //initialize constructor
    Circle(int radius)
    {
        this.radius = radius;
        this.counter = this.counter + 1;
    }

    public int getRadius()
    {
        return radius;
    }

    public void setRadius(int radius)
    {
        this.radius = radius;
    }

    public int getCounter()
    {
        return counter;
    }

    @Override
    public String toString()
    {
        return "Circle{" + "radius=" + radius + '}';
    }

    @Override
    public int getArea()
    {
        int area = 0;
        area = (int) ((this.radius * this.radius) * PI);
        System.out.println(area);
        return area;
    }

}
