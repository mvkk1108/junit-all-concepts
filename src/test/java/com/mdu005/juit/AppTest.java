package com.mdu005.juit;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Unit test for simple App.
 */

@RunWith(Suite.class)
@SuiteClasses({EmployeeUtilsTest.class,MathOperationsTest.class,ParameterTestForAddTest.class,FactorialParameterizedTest.class})
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    
}
