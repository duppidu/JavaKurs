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
public class TageEinesMonats
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int tage, monat = 0;
        System.out.println("Welchen Monat meinst du?");
        monat = in.nextInt();
        switch (monat)
        {
            case 1:
                tage = 31;
                break;
            case 2:
                tage = 28;
                break;
            case 3:
                tage = 31;
                break;
            case 4:
                tage = 30;
                break;
            case 5:
                tage = 31;
                break;
            case 6:
                tage = 30;
                break;
            case 7:
                tage = 31;
                break;
            case 8:
                tage = 31;
                break;
            case 9:
                tage = 30;
                break;
            case 10:
                tage = 31;
                break;
            case 11:
                tage = 30;
                break;
            case 12:
                tage = 31;
                break;
            default:
                tage = 0;
                break;
        }

        System.out.println("Dieser Monat hat " + tage + " Tage");

    }

}
