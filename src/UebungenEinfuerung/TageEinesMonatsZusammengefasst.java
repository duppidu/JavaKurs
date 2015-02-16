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
public class TageEinesMonatsZusammengefasst
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int tage, monat = 0;
        System.out.println("Welchen Monat meinst du?");
        monat = in.nextInt();
        switch (monat)
        {

            case 2:
                tage = 28;
                break;

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                tage = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                tage = 30;
                break;

            default:
                System.out.println("Du bisch e löu");
                tage=0;
                break;
        }

        System.out.println("Dieser Monat hat " + tage + " Tage");

    }
}
