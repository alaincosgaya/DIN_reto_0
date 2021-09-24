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
        assertNotNull(testTextViewFactory.getView()instanceof ViewTextImplementation);
       
    }
    
    @Test
    public void testGetViewSwing() {
        ViewFactory testSwingViewFactory = new ViewFactory();
        assertNotNull(testSwingViewFactory.getView() instanceof ViewSwingImplementation);
    }
    
    @Test
    public void testGetViewFx() {
        ViewFactory testFxViewFactory = new ViewFactory();
        assertNotNull(testFxViewFactory.getView() instanceof ViewFxImplementation);
    }
    
    
}
