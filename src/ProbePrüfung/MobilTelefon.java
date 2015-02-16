/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProbePrüfung;

import java.util.Scanner;

/**
 *
 * @author thomas.duppenthaler
 */
public class MobilTelefon
{
    public String hersteller;
    private String modell;
    private int standbyZeit=0;
    private int gespraechszeit;
    private double gewicht;

    public String attributToString()
    {
        return "Hersteller:     " + hersteller + "\nModell:         " + modell + "\nStandbyzeit:    " + standbyZeit + "\nGesprächszeit:  " + gespraechszeit + "\nGewicht:        " + gewicht+"\n\n";
    }

    public void eingabe()
    {
        Scanner in = new Scanner(System.in);
        int length = 0;
        while (length == 0)
        {
            System.out.println("Hersteller:");
            this.hersteller = in.next();
            if (hersteller.length() == 0)
            {
                System.out.println("Ungültige Eingabe");
            }
            length = hersteller.length();
        }
        
        length = 0;
        while (length == 0)
        {
            
            System.out.println("Modell:");
            this.modell = in.next();
            if (modell.length() == 0)
            {
                System.out.println("Ungültige Eingabe");
            }
            length = modell.length();
        }
 
        System.out.println("Standby Zeit:");
        this.standbyZeit = in.nextInt();
      
        
        System.out.println("Gesprächszeit:");
        this.gespraechszeit = in.nextInt();

        System.out.println("Gewicht:");
        this.gewicht = in.nextDouble();
        System.out.println("\n");
    }

    public void setAttribut(String Hersteller, String Modell, int StandbyZeit, int GesprächsZeit, double Gewicht)
    {
        this.hersteller = Hersteller;
        this.modell = Modell;
        this.standbyZeit = StandbyZeit;
        this.gespraechszeit = GesprächsZeit;
        this.gewicht = Gewicht;
    }
}
