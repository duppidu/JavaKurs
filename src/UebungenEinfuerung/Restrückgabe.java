/*

 */
package UebungenEinfuerung;

import java.util.Scanner;

/**
 *
 * @author thomas.duppenthaler
 */
public class Restrückgabe
{
    public static int restbetrag(int zahl1, int zahl2)
    {

        int rest;
        rest = zahl1 % zahl2;
        return rest;

    }

    public static void main(String[] args)
    {

        int x;
        int y;
        Scanner in = new Scanner(System.in);

        System.out.println("gib deinen Divident ein");
        x = in.nextInt();
        System.out.println("gib deinen Divisor ein");
        y = in.nextInt();

        int rest = restbetrag(x, y);

        System.out.println("Der Rest beträgt " + rest);

    }

}
