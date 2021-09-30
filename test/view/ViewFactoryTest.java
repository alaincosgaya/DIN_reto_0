package view;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Idoia Ormaetxea
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
