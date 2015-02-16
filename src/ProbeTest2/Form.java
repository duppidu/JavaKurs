/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProbeTest2;

/**
 *
 * @author thomas.duppenthaler
 */
public abstract class Form
{
    public static final int MINX = 0; // x-Koord. der linken oberen Ecke der Zeichenfläche
    public static final int MINY = 0; // y- Koord. der linken oberen Ecke der Zeichenfläche
    public static final int MAXX = 80; // x- Koord. der rechten unteren Ecke der Z.-Fläche
    public static final int MAXY = 25; // y- Koord. der rechten unteren Ecke der Z.-Fläche 
    protected int x;
    protected int y;
    private static int objectCounter = 0;

    Form()
    {
        this.x = 1;
        this.y = 1;
        this.objectCounter++;
    }

    Form(int x, int y)
    {
        this.x = x;
        this.y = y;
        this.objectCounter++;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
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

    public abstract double getArea();

}
