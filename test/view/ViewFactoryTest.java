/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 2dam
 */
public class ViewFactoryTest {
    
    @Test
    public void testGetViewText() {
        ViewFactory testTextViewFactory = new ViewFactory();  
        assertTrue(testTextViewFactory.getView()instanceof ViewTextImplementation);
       
    }
    
    @Test
    public void testGetViewSwing() {
        ViewFactory testSwingViewFactory = new ViewFactory();
        assertTrue(testSwingViewFactory.getView() instanceof ViewSwingImplementation);
    }
    
    @Test
    public void testGetViewFx() {
        ViewFactory testFxViewFactory = new ViewFactory();
        assertTrue(testFxViewFactory.getView() instanceof ViewFxImplementation);
    }
    
    
}
