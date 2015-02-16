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
public class MobilTelefonListe
{
    MobilTelefon[] phones;
    int anzPhones;

    public void arrays()
    {
        phones = new MobilTelefon[anzPhones];
        int x = 0;
        do
        {
            phones[x] = new MobilTelefon();
            x++;
        } while (x < phones.length);

    }

    public void setArrays()
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Wie viele Telefone möchtest du erstellen?");
        anzPhones = in.nextInt();
        System.out.println("");
        arrays();

    }

    public void eingabeListe()
    {

        System.out.println("Eingabe:\n==========");
        for (MobilTelefon pho : phones)
        {
            pho.eingabe();

        }
    }

    public void ausgeben()
    {
        System.out.println("");
        System.out.println("Ausgebe:\n==========");

        for (MobilTelefon phon : phones)
        {
            System.out.println(phon.attributToString());
        }
    }

    public void drehen()
    {
        System.out.println("");
        System.out.println("Ausgebe:\n==========");
        int a = anzPhones - 1;
        while (a >= 0)
        {
            System.out.println(phones[a].attributToString());
            a--;
        }
    }

}
