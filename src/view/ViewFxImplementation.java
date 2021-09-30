package view;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * Shows the View Implementation with JavaFx
 * @author Idoia Ormaetxea
 */
public class ViewFxImplementation extends Application implements ViewInterface{
    private static String msg = "";
    private Alert alert;
    /**
     * The method that creates the view
     * @param primaryStage 
     */
    @Override
    public void start(Stage primaryStage) {
         
        Label lb = new Label(msg);
        Pane root = new Pane();
        root.getChildren().add(lb);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Greeting");
        primaryStage.setScene(scene);
        primaryStage.show();
       
        
    }

    /**
     * The method that launches the View and inserts the message
     * @param message 
     */
    @Override
    public void showGreeting(String message) {
        msg = message;
        launch(new String[1]);
        
        
    }
    
    
}
