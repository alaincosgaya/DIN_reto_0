/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alain Cosgaya
 */
public class ModelFactoryTest {
    
    @Test
    public void testGetModelFile() {
        ModelFactory testFileModelFactory = new ModelFactory();  
        assertTrue(testFileModelFactory.getModel() instanceof ModelFileImplementation);
       
    }
    
    @Test
    public void testGetModelBd() {
        ModelFactory testBdModelFactory = new ModelFactory();
        assertTrue(testBdModelFactory.getModel() instanceof ModelBdImplementation);
    }
    
}
