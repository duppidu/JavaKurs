/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafik;



import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

/**
 *
 * @author thomas.duppenthaler
 */
public class MyEvtHnd implements EventHandler<ActionEvent>
{

    @Override
    public void handle(ActionEvent event)
    {
       Button tmp=(Button)event.getSource();
        switch(tmp.getText())
        {
            case "Up":
                System.out.println("Up"); break;
                
            case "Down":
                System.out.println("Down");break;
      
        }
        
       
            
           /** if(event.getSource() instanceof Button)
        {
            System.out.println("Hallo Button wurde gedrückt");
            
             Button btn;
            btn=(Button)event.getSource();
            String txt=btn.getText().equals("ON")?"OFF":"ON";
            btn.setText(txt);
            
       }*/
    }
    
}
