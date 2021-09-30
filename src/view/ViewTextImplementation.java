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
