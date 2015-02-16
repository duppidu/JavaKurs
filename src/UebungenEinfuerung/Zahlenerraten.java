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
public class Zahlenerraten
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in); //Scanner instanzieren
        int eingabezahl;
        System.out.println("Willkommen zum Zahlenratespiel");
        boolean neuesspiel = false;

        do
        {
            System.out.println("Ich denke mir eine Zahl von 1 bis 100, versuche sie zu erraten");
            int zufallszahl = (int) (Math.random()* 100 + 1);
            int anzversuche = 0, nochmal;
            boolean neueAbfrage = false;

            do
            {

                System.out.println("welche Zahl meinst du?");
                eingabezahl = in.nextInt();
                anzversuche++;

                if (zufallszahl < eingabezahl)
                {
                    System.out.println("die Gesuchte Zahl ist kleiner");
                    neueAbfrage = false;
                } else if (zufallszahl > eingabezahl)
                {
                    System.out.println("die Gesuchte Zahl ist grösser");
                    neueAbfrage = false;
                } else
                {
                    System.out.println("Du hasst die Zahl erraten!!!\nAnzahl Versuche " + anzversuche);
                    neueAbfrage = true;
                }

            } while (neueAbfrage == false);
            System.out.println("Willst du nochmal spielen?\nJa=1 Nein=0");
            nochmal = in.nextInt();
            if (nochmal == 1)
            {
                neuesspiel = true;
            } else
            {
                neuesspiel = false;
                System.out.println("Auf Widersehen");

            }

        } while (neuesspiel == true);

    }

}
