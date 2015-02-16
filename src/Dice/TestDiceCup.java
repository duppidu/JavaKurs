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
public class TestDiceCup
{
    public static void main(String[] args)
    {
        
        DiceCup d1= new DiceCup();
       DiceCup d2= new DiceCup(7);
        d2.rollCup();
        d2.getCupNum();
        
        
    } 
}
