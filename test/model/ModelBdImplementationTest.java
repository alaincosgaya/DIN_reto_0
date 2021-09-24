/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import exception.DaoException;
import exception.ReadException;
import java.net.ConnectException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alain Cosgaya
 */
public class ModelBdImplementationTest {

    @Test
    public void testBdGetGreeting() throws ConnectException, DaoException, ReadException {
        
        String greeting;
        
        ModelBdImplementation TestModelBd = new ModelBdImplementation(); 
        greeting = "Hola muy buenas.";
        
        assertEquals(greeting, TestModelBd.getGreeting());
    }
    
}
