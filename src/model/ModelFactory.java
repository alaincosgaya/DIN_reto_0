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
