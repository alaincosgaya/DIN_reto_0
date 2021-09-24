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
 * @author 2dam
 */
public class ModelFactoryTest {
    
    @Test
    public void testGetModelFile() {
        ModelFactory testFileModelFactory = new ModelFactory();  
        assertNotNull(testFileModelFactory.getModel() instanceof ModelFileImplementation);
       
    }
    
    @Test
    public void testGetModelBd() {
        ModelFactory testBdModelFactory = new ModelFactory();
        assertNotNull(testBdModelFactory.getModel() instanceof ModelBdImplementation);
    }
    
}
