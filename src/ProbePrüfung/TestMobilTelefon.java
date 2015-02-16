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
public class TestMobilTelefon
{

    public void eingabe(String Objektname)
    {

        Scanner in = new Scanner(System.in);
      

    }

    public static void main(String[] args)
    {
        MobilTelefon m1 = new MobilTelefon();
       m1.eingabe();
        System.out.println(m1.attributToString());

    }
}
