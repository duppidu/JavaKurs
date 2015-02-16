/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruefung2;

/**
 *
 * @author thomas.duppenthaler
 */
public class Firma
{
    public static final int MAXPERSON = 100;
    Person[] pers = new Person[MAXPERSON];
    int pos = 0;

    public void add(Person person)
    {
        pers[pos] = person;
        pos++;
    }

    public void listPerson()
    {
        for (int i = 0; i < pos; i++)
        {
            System.out.println(pers[i].toString());
        }
    }

    public static void main(String[] args)
    {
        Firma firma = new Firma();
        firma.add(new Kunde("3.2.2014", true, "Hans", "Muster"));
        firma.listPerson();
    }
}
