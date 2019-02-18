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
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
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
       Menu menu = new Menu("Menu 1"); 
       MenuItem menuItem1 = new MenuItem("Item 1"); 
       MenuItem menuItem2 = new MenuItem("Item 2");
       MenuItem menu3= new MenuItem("",new ImageView(image));
       menu.getItems().add(menuItem1); 
       menu.getItems().add(menuItem2);
       Menu menu2 = new Menu("Menu 2"); 
       MenuBar menuBar = new MenuBar(); 
       menuBar.getMenus().add(menu); 
       menuBar.getMenus().add(menu2);
       menu2.getItems().add(menu3);
       GridPane pane = new GridPane(); 
       ColumnConstraints col =new ColumnConstraints();
       col.setPercentWidth(5);
       ColumnConstraints col1 =new ColumnConstraints();
       col.setPercentWidth(5);
       ColumnConstraints col2 =new ColumnConstraints();
       col.setPercentWidth(20);
       ColumnConstraints col3 =new ColumnConstraints();
       col.setPercentWidth(20);
       ColumnConstraints col4 =new ColumnConstraints();
       col.setPercentWidth(20);
       pane.getColumnConstraints().addAll(col,col1,col2,col3,col4);
       pane.setAlignment(Pos.BASELINE_LEFT); 
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5)); 
       pane.setHgap(5.5); pane.setVgap(5.5);

        pane.add(new Label("First Name:"), 0, 0,1,1); 
        pane.add(new TextField(), 1, 0); 
        pane.add(new Label("MI:"), 0, 1,1,1); 
        pane.add(new TextField(), 1, 1); 
        pane.add(new Label("Last Name:"), 0, 2,1,1); 
        pane.add(new TextField(), 1, 2); 
        Button btAdd = new Button("Add Name"); 
        //pane.add(btAdd, 1, 3);
        HBox hbox = new HBox(button1, button2,button3,menuBar);
         pane.add(hbox, 3, 0);
         pane.add(btAdd, 5, 0,1,1);
        GridPane.setHalignment(btAdd, HPos.RIGHT); 
        
        
        
        Scene scene = new Scene(pane, 600, 300); 
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
