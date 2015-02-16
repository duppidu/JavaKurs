/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thomas.duppenthaler
 */
public class beep
{
    public void taktTick() // sekundentakt
    {
        boolean x = true;
        do
        {
          java.awt.Toolkit.getDefaultToolkit().beep();
            try
            {
                Thread.sleep(100);
            } catch (InterruptedException ex)
            {
                Logger.getLogger(beep.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } while (x = true);

    }
    
    
    
    
    
    
    
    public static void main(String[] args)
    {
        beep b1= new beep();
        b1.taktTick();
        
                }
}
