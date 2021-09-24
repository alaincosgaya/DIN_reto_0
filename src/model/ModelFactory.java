/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ResourceBundle;

/**
 * The Factory of the Model
 * @author Alain Cosgaya
 */
public class ModelFactory {
    private ResourceBundle data;
    private final String BD_TYPE="BD";
    private final String FILE_TYPE="FILE";
    /**
     * It selects the type of model depending of the data file
     * @return the model that is choosen 
     */
    public  ModelInterface getModel(){
        ModelInterface model = null;
        data=ResourceBundle.getBundle("application.data");
        switch(data.getString("model_type")){
            case BD_TYPE:
                model = new ModelBdImplementation();
                break;
            case FILE_TYPE:
                model = new ModelFileImplementation();
                break;
           
      }
       return model;
    }
    
}
