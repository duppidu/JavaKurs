/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UebungenEinfuerung;

import java.util.Scanner;

/**
 *
 * @author thomas.duppenthaler
 */
public class Thermometer
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double bodyTemp;
        System.out.println("Wie hoch ist die Körpertemperatur?");
        bodyTemp = in.nextDouble();
        boolean nochmal;
        do
        {

            if (bodyTemp > 37.0)
            {
                System.out.println("Fieber!");
            } else

            {
                System.out.println("Normal!");
            }
        } while (nochmal=true);

    }
}
