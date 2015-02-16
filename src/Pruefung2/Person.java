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
public abstract class Person
{
    String vorname;
    String nachname;
    private static int personCounter = 0;

    public Person(String vorname, String nachname)
    {
        this.vorname = vorname;
        this.nachname = nachname;
        personCounter++;
    }

    public static int getPersonCounter()
    {
        return personCounter;
    }

    @Override
    public abstract String toString();

}
