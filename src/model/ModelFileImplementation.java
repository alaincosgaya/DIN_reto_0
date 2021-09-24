/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
