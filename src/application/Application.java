package application;

import controller.Controller;
import model.ModelFactory;
import view.ViewFactory;

/**
 *
 * @author Alain Cosgaya
 */
public class Application {

    /**
     * This program saves the data from the factories and create the controller to run the app
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) throws Exception {
        ViewFactory view = new ViewFactory();
        ModelFactory model = new ModelFactory();
        
        Controller controller = new Controller();
        controller.run(view.getView(),model.getModel());  
    }  
}
