/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ResourceBundle;

/**
 *
 * @author Idoia
 */
public class ViewFactory {
    private ResourceBundle data;
    
    
    public  ViewInterface getView(){
       ViewInterface view = new ViewTextImplementation();
       return view;
    }
}
