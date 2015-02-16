/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UebungenEinfuerung;

import java.util.Scanner;

public class Eingabe
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int meineEingabe;
        System.out.println("gib etwas ein:");
        meineEingabe = in.nextInt();
        System.out.println("Kontrolle:" + meineEingabe);

    }

}
