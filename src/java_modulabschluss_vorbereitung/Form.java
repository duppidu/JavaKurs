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
public abstract class Form
{
    //Constants for Drawing Frame Size
    int MINX = 0;
    int MINY = 0;
    int MAXX = 80;
    int MAXY = 25;
    private int x;
    private int y;
    private static int objectCounter = 0;

    //default consturctor
    Form()
    {
        this.objectCounter = objectCounter + 1;
    }

    //initialize constructor
    Form(int xCoor, int yCoor)
    {
        this.x = xCoor;
        this.y = yCoor;
        this.objectCounter = objectCounter + 1;

    }

    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public int getY()
    {
        return y;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public static int getObjectCounter()
    {

        return objectCounter;
    }

    @Override
    public String toString()
    {
        return "Form{" + "x=" + x + ", y=" + y + '}';
    }

    //Abstract method getArea
    public abstract int getArea();

}
