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
public class Kunde extends Person
{
    String letztebestellung;
    boolean stammKunde;

    public Kunde(String letztebestellung, boolean stammKunde, String vorname, String nachname)
    {
        super(vorname, nachname);
        this.letztebestellung = letztebestellung;
        this.stammKunde = stammKunde;
    }

    @Override
    public String toString()
    {
        return "Kunde{" +" Vorname: "+ vorname+" Nachname: "+nachname+" Letztebestellung: " + letztebestellung + ", Stamm Kunde: = " + stammKunde + '}';
    }

    
}
