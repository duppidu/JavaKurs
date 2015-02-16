/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruefung2;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author thomas.duppenthaler
 */
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Kreis extends Application implements EventHandler<ActionEvent>
{
Pane root1 = new Pane();
    private Button btn;

    @Override
    public void start(Stage stage)
    {
        btn = new Button("Draw Circle");

        btn.setOnAction(this);

        

        root1.getChildren().add(btn);

        Scene scene = new Scene(root1, 200, 200);
        stage.setTitle("Circle");
        stage.setScene(scene);
        stage.show();

    }

    @Override
    public void handle(ActionEvent event)
    {

        Button tmp = (Button) event.getSource();
        switch (tmp.getText())
        {
            case "Draw Circle":
                Circle circle = new Circle();
                circle.setCenterX(150.0f);
                circle.setCenterY(150.0f);
                circle.setRadius(100.0f);
                circle.setFill(Color.BLUE);
                root1.getChildren().add(circle);

                
                break;

        }

    }

    public static void main(String[] args)
    {
        launch(args);

    }

}
