/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

/**
 *
 * @author thomas.duppenthaler
 */
public class Bubblesort
{
     int[] x = new int[10];
     int z;

    public  void fill()
    {
         for(int i=0;i<x.length;i++)
        {
            x[i]=(int) (1 + Math.random() * 100);
        }
       
    }

    public void sort()
    {
        boolean unsortiert = true;
        int temp;

        while (unsortiert)
        {
            unsortiert = false;
            for (int i = 0; i < x.length - 1; i++)
            {
                if (x[i] > x[i + 1])
                {
                    temp = x[i];
                    x[i] = x[i + 1];
                    x[i + 1] = temp;
                    unsortiert = true;
                }
            }
        }
    }

    public void write()
    {
        for (int i : x)
        {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args)
    {
        Bubblesort b1 = new Bubblesort();
        b1.fill();
        b1.write();
        b1.sort();
        b1.write();

    }
}
