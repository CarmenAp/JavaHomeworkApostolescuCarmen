/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author qqq
 */
public class DefinibilaIT {
    
    public DefinibilaIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getDefinibila method, of class Definibila.
     */
    @Test
     public void testGetDefinition() {
        System.out.println("getDefinition");
        DefinibilaImpl instance = new DefinibilaImpl();
        String expResult = "";
        String result = instance.getDefinition();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    public class DefinibilaImpl {

        public String getDefinition() {
            return "";
        }

       
    }
    
}
