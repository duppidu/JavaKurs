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
public class Rectangel extends Form
{
    private int lenght;
    private int widht;
    private static int counter = 0;

    Rectangel()
    {
        this.counter++;
    }

    Rectangel(int lenght, int widht)
    {
        this.lenght = lenght;
        this.widht = widht;
        this.counter++;
    }

    public void setLenght(int lenght)
    {
        this.lenght = lenght;
    }

    public void setWidht(int widht)
    {
        this.widht = widht;
    }

    public int getLenght()
    {
        return lenght;
    }

    public int getWidht()
    {
        return widht;
    }

    public static int getCounter()
    {
        return counter;
    }

   
    
    @Override
    public String toString()
    {
        return "Rectangel{" + "lenght=" + lenght + ", widht=" + widht + '}';
    }

    @Override
    public double getArea()
    {
        return this.lenght * this.widht;
    }

    public void draw()
    {
        int startX = getX();
        int startY = getY();

        int x = 0;
        int y = 0;
        int drawx = 0;
        int drawy = 0;

        for (y = 0; y < startY; y = y + 1)
        {
            System.out.print("\n");
        }
        for (drawy = 0; drawy < this.widht; drawy = drawy + 1)
        {

            for (x = 0; x < startX; x = x + 1)
            {
                System.out.print(" ");

            }
            for (drawx = 0; drawx < this.lenght; drawx = drawx + 1)
            {

                System.out.print("%");
            }
            System.out.print("\n");

        }

    }
}
