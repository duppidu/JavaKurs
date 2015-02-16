/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafik;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author thomas.duppenthaler
 */
public class BtnDemo extends Application
{
    private Button btnUp, btnDown, btnLeft, btnRight;

    @Override
    public void start(Stage stage)
    {
        btnUp = new Button("Up");
        btnDown = new Button("Down");
        btnLeft = new Button("Left");
        btnRight = new Button("Right");
        EventHandler myH = new MyEvtHnd();
        btnUp.setOnAction(myH);
        btnDown.setOnAction(myH);
        VBox root1 = new VBox();
        
        root1.getChildren().add(btnUp);
        root1.getChildren().add(btnDown);
       
        
        
        Scene scene = new Scene( root1, 200, 200);
      
        scene.setRoot(root1);
        stage.setTitle("BtnDemo");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args)
    {
        launch(args);

    }
}
