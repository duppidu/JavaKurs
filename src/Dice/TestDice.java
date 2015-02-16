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

public class TestDice
    {
        public static void main(String[] args)
        {
            Dice d1 = new Dice();
            Dice d2 = new Dice(1, 300);

            d2.controll(10000);
        }
    }

