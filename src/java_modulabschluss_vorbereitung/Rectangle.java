/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_modulabschluss_vorbereitung;

/**
 *
 * @author simon.zeltner
 */
public class Rectangle extends Form
{
    private int length;
    private int height;
    private static int counter = 1; // Darf ich das so machen?

    //Default Constructor
    Rectangle()

    {
        this.counter = this.counter+1;

    }

    //initialize constructor
    Rectangle(int length, int height)
    {
        this.length = length;
        this.height = height;
        this.counter = this.counter++;
    }

    public int getCounter()
    {
        return counter;
    }

    public int getLength()
    {
        return length;
    }

    public void setLength(int length)
    {
        this.length = length;
    }

    public int getHeight()
    {
        return height;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    @Override
    public String toString()
    {
        return "Rectangle{" + "length=" + length + ", height=" + height + '}';
    }

    @Override
    public int getArea()
    {
        int area = 0;
        area = this.height * this.length;
        System.out.println(area);
        return area;
    }

    public void draw()
    {
        int x;
        int y;

        for (y = 0; y < this.height; y++)
        {
            for (x = 0; x < this.length; x = x + 1)
            {
                System.out.print("%");

            }
            System.out.println("");
        }
    }

}
