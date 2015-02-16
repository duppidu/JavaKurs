/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clock;

/**
 *
 * @author thomas.duppenthaler
 */
public class Call
{
    public void byValue(int j)
    {
        j = 23;
    }

    public void byReference(Clock c)
    {
        c.hour = 5;
    }

    
    public static void main(String[] args)
    {
        Call call=new Call();
        
        Clock c =new Clock();
        c.hour=22;
        call.byReference(c);
        System.out.println(c.hour);
        int i=4;
        call.byValue(i);
        System.out.println(i);
        
        
        Clock c1=new Clock();
        c1.hour=4;
        Clock c2=new Clock();
        c2=c1;
        System.out.println(c2.hour);
        c1.hour=5;
         System.out.println(c2.hour);
        
        boolean ok=(c1==c2);
        System.out.println(ok);
    }
}
