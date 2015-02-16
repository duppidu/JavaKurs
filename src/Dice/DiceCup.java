/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dice;

/**
 *
 * @author thomas.duppenthaler
 */
public class DiceCup
{
    Dice[] dices;
int anzDices ;
    public DiceCup()
    {

        dices = new Dice[5];
        int x = 0;
        do
        {
            dices[x] = new Dice();
            x++;
        } while (x < dices.length);

    }

  
     public DiceCup(int Anz)
    {

        dices = new Dice[Anz];
        int x = 0;
        do
        {
            dices[x] = new Dice();
            x++;
        } while (x < dices.length);

    }
    
 public void getDice(int DiceNum)
  {
      dices = new Dice[1];
      dices[DiceNum]=new Dice();
  }
     
     public void rollCup() //Alle Würfel rollen
    {
     
      for(Dice i :dices)
        {
            i.roll();
            
        } 

    }
public void getCupNum() // Ausgabe der Würfel ergebnisse
{
    int x = 0;
    do

        {
           
            System.out.println("Würfel "+(x+1)+ " = "+ dices[x].getValue());
            x++;
        } while (x < dices.length);
}
   

}
