/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UebungenEinfuerung;


import java.util.Scanner;

public class Notenprogramm
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in); //Scanner instanzieren
double n1,n2,n3;
double summe,schnitt;
boolean genuegend;

System.out.println("*** Notenschnittprogramm ***\n----------------------------\n");

System.out.println("Note 1 eingeben: ");
n1=in.nextDouble(); //aktuelle Note eingeben

System.out.println("Note 2 eingeben: ");
n2=in.nextDouble();

System.out.println("Note 3 eingeben: ");
n3=in.nextDouble();
 
summe=n1+n2+n3; //Note in Summe addieren

schnitt=summe/3; //Schnitt ausrechnen
genuegend=(schnitt>=4); //TESTEN ob genügend

System.out.println("\n\nNote 1:\t\t"+n1+"\nNote 2:\t\t"+n2+"\nNote 3:\t\t"+n3+"\n");
System.out.println("Summe:\t\t"+summe);
System.out.println("Durchschnitt:\t"+schnitt);

if(schnitt>=60) //Entscheid ob genügend
{
System.out.println("Genügend !");
}
else
{
System.out.println("Ungenügend !");
}
System.out.println("Und Tschüss!");
}
}