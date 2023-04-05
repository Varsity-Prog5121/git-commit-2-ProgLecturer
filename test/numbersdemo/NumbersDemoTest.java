/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbersdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Work
 */
public class NumbersDemoTest {
    
    public NumbersDemoTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testMain() {
       
    }

    @Test
    public void testDisplayTwiceTheNumber() {
        System.out.println("displayTwiceTheNumber");
        int number = 2;
        int expResult = 4;
        int result = NumbersDemo.displayTwiceTheNumber(number);
        assertEquals(expResult, result);
    }

    @Test
    public void testDisplayNumberPlusFive() {
        System.out.println("displayNumberPlusFive");
        int number = 2;
        int expResult = 7;
        int result = NumbersDemo.displayNumberPlusFive(number);
        assertEquals(expResult, result);
    }

    @Test
    public void testDisplayNumberSquared() {
        System.out.println("displayNumberSquared");
        int number = 5;
        int expResult = 25;
        int result = NumbersDemo.displayNumberSquared(number);
        assertEquals(expResult, result);
    }
    
}
