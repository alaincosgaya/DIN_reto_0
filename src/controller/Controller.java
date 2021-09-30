package controller;

import model.ModelInterface;
import view.ViewInterface;

/**
 * The controller that runs the view  with the data of the model
 * @author Idoia Ormaetxea
 */
public class Controller {
    /**
     * This method shows the greeting
     * @param view The view that shows the data of the model
     * @param model Has the data 
     */
    public void run(ViewInterface view, ModelInterface model) throws Exception{
        String data;
        data = model.getGreeting();
        view.showGreeting(data);
    }
    
}
