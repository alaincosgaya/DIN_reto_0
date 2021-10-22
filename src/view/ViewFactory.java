/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ResourceBundle;

/**
 * The Factory of the View
 * @author Alain Cosgaya
 */
public class ViewFactory {
    private ResourceBundle data;
    private final String TEXT_TYPE = "TEXT";
    private final String SWING_TYPE = "SWING";
    private final String FX_TYPE = "FX";
    /**
     * It selects the type of view depending of the data file
     * @return the view that is choosen
     */
    public  ViewInterface getView(){
       ViewInterface view =null;
        data=ResourceBundle.getBundle("application.data");
        switch(data.getString("view_type")){
            case TEXT_TYPE:
                view = new ViewTextImplementation();
                break;
            case SWING_TYPE:
                view = new ViewSwingImplementation();
                break;
            case FX_TYPE:
                view = new ViewFxImplementation();
           
      }
       return view;
    }
}
