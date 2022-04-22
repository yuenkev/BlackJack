/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

/**
 *
 * @author Kevin
 */
public class MainJUnit {
   
@Test
public void testCheckMainMethodGood(){
    System.out.println("checkMainMethod");
    boolean expResult = true;
    boolean result = true;
    assertEquals(expResult, result);
    
    //fail("The test case is a prototype.");
}

@Test
public void testCheckMainMethodBad(){
    System.out.println("checkMainMethod");
    boolean expResult = false;
    boolean result = false;
    assertEquals(expResult, result);
    
    //fail("The test case is a prototype.");
}

    
}
