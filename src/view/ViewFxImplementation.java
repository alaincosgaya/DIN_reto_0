/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author 2dam
 */
public class ViewFxImplementation extends Application implements ViewInterface{
    private Alert alert;
    
    @Override
    public void start(Stage primaryStage) {
         
        alert = new Alert(Alert.AlertType.NONE);
        alert.setTitle("Greeting");
        
        alert.setHeaderText(null);
        alert.getDialogPane().getButtonTypes().add(ButtonType.CLOSE);
        alert.showAndWait();
       
        
    }

    
    @Override
    public void showGreeting(String message) {
        String[] data = new String[1];
        data[0]=message;
        launch(data);
        
        
    }
    
    
}
