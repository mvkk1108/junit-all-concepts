package com.mdu005.juit;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class FactorialParameterizedTest {
	
	@Parameter(0)
	public int inpuvalue;
	@Parameter(1)
	public int expectedvalue;
	
	
	
	/*
	 * public FactorialParameterizedTest(int inpuvalue,int expectedvalue) {
	 * this.inpuvalue = inpuvalue; this.expectedvalue = expectedvalue; }
	 */
	
	
	@Parameters
	public static Collection<Integer[]> params()
	{
		Integer[] [] params = new Integer[][] {
			{3,6},{4,24},{5,120},{6,720}
		};
		
		return Arrays.asList(params);
	}
	
static MathOperations mathOperations;
	@BeforeClass
	public static void setUp()
	{
		mathOperations = new MathOperations();
	}
	
	
	@Test
	public void testPactorial()
	{
		// 3(input value)  6 (Expected value)
		// 4 24
		// 5 120
		
		assertEquals(this.expectedvalue, mathOperations.factorial(inpuvalue));
		//assertEquals(24, mathOperations.factorial(4));
	    //assertEquals(120, mathOperations.factorial(6));
	}
	
}
