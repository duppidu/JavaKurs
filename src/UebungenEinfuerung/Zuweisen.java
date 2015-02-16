package UebungenEinfuerung;

/**
 *
 * @author thomas.duppenthaler
 */
public class Zuweisen 
{

    public static void main(String[] args) 
    {
        System.out.println("Hello World");
        double zahl = 3.14;
        boolean ok=true;
        String text="Hallo";
        text=text+ " HFTM";
        int t = 0;
        boolean res= (t>=15)&&(t<=20);
    
        double zahlDouble = 3.14;
        int zahlInt = 5;
        zahlDouble=zahlInt;
        zahlInt=(int) zahlDouble; // .14 geht verlohren da int keine Kommazahlen anzeigen kan
    
        
    
    }
    
}
