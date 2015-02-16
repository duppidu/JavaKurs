/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruefung;



/**
 *
 * @author thomas.duppenthaler
 */
public class Table
{
    int[] tab;
    int rangeMin;
    int rangeMax;
    

    public Table(int range)
    {

        tab = new int[range];
    }

    public void fill(boolean zufall)
    {
        if (zufall)
        {
            
            for(int x:tab)
            {

                x = (int) (Math.random() * tab.length);
            } 
        }
    }

    public void fill(int max, int min)
    {

        this.rangeMin = min;
        this.rangeMax = max;
        int y = 0;
        for(int i=0;i<tab.length;i++)
        {
            tab[i]=min+i;
        }
    }

    @Override
    public String toString()
    {

        return "|" + tab[0] + "|" + tab[1] + "|" + tab[2] + "|" + tab[3] + "|" + tab[4] + "|" + tab[5] + "|" + tab[6] + "|" + tab[7] + "|" + tab[8] + "|" + tab[9] + "|";
    }

    public int getRangeMax()
    {
        return rangeMax;
    }

    public void setRangeMax(int rangeMax)
    {
        this.rangeMax = rangeMax;
    }

    public int max()
    {
        
        int maxNr = 0;
        for (int i=0;i<tab.length;i++)
        {
            if(tab[i]>maxNr)
            {
                maxNr=tab[i];
            }
        }
        
        return maxNr;
   
    }

    public static void main(String[] args)
    {
        Table tab = new Table(10);
        tab.fill(true);
        System.out.println(tab);
        int maxNr = tab.max();
        tab.fill(13, 22);
    }
}
