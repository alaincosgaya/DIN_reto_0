/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 * The Implementation of the View to Console
 * @author Idoia Ormaetxea
 */
public class ViewTextImplementation implements ViewInterface{
    /**
     * Shows the text
     * @param message 
     */
    @Override
    public void showGreeting(String message) {
        System.out.println(message);
    }
    
}
