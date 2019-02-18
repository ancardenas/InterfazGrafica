/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import javafx.scene.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

/**
 *
 * @author ancardenas
 */
public class JavaFXApplication1 extends Application {
    
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        FileInputStream input = new FileInputStream("icono.png");
        Image image = new Image(input);
        Button button3 = new Button("",new ImageView(image));
        input = new FileInputStream("Cerrar.png");
        image = new Image(input);
        primaryStage.setTitle("HBox"); Button button1 = new Button("Number 1");
        Button button2 = new Button("",new ImageView(image));
        
       /*Label label1=new Label("Search");
       FileInputStream input=new FileInputStream("Guardar.png");
       File file =new File("Guardar.png");
       Image image = new Image (file);
       Label label2 = new Label("Hola", ImageView(image));
        */
         
        
        HBox hbox = new HBox(button1, button2,button3);
        Scene scene = new Scene(hbox, 200, 100); 
        primaryStage.setScene(scene); 
        primaryStage.show(); 
        
   

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
