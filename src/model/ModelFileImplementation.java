package model;

import java.util.ResourceBundle;


/**
 * The implementation of the model in the File
 * @author Idoia Ormaetxea
 */
public class ModelFileImplementation implements ModelInterface{
    /**
     * Get the text from the File
     * @return The text that is save in the File
     */
    @Override
    public String getGreeting() {
        String text;
        ResourceBundle text_data;
        text_data = ResourceBundle.getBundle("model.File");
        text = text_data.getString("message");
      
        return text;
    }
    
    
}
