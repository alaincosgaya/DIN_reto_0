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
 * @author Idoia Ormaetxea
 */
public class ModelFileImplementationTest {
    
    @Test
    public void testFileGetGreeting() {
        
        String greeting;
        
        ModelFileImplementation testModelFile = new ModelFileImplementation(); 
        greeting = "Hola muy buenas, soy el texto.";
        
        assertEquals(greeting, testModelFile.getGreeting());
        
        
    } 
}
