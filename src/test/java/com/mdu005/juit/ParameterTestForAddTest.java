package com.mdu005.juit;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class ParameterTestForAddTest {
@Parameter(0)
	public int input1;
@Parameter(1)
	public int input2;
@Parameter(2)
	public int expexted;
	
/*
 *  1 2 3
 *  2 3 5
 *  3 4 5
 *  	
 */
	
	@Parameters
	public static Collection<Integer[]> params()
	{
		Integer[][] params = new Integer[][] {
			{1,2,3},{2,3,5},{3,4,7},{5,6,11}
		};
		
		return Arrays.asList(params);
	}

	
	@Test
	public void testAdd()
	{
		MathOperations mo = new MathOperations();
		assertEquals(this.expexted, mo.add(input1, input2));
	}
}
