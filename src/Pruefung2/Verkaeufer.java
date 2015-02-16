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
public class Verkaeufer extends Person
{
    int gehalt;
    String anstellungsDatum;

    public Verkaeufer(int gehalt, String anstellungsDatum, String vorname, String nachname)
    {
        super(vorname, nachname);
        this.gehalt = gehalt;
        this.anstellungsDatum = anstellungsDatum;
    }

    @Override
    public String toString()
    {
        return "Verkaeufer{" +" Vorname: "+ vorname+" Nachname: "+nachname+", Anstellungs Datum: " + anstellungsDatum + '}';
    }
    
}
