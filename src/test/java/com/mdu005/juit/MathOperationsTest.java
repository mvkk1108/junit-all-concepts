package com.mdu005.juit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class MathOperationsTest {

	static MathOperations mathOp ;
	//@BeforeClass
	@Before
	public   void init()
	{
		mathOp = new MathOperations();
		System.out.println("inside init method");
	}
	//@AfterClass
	@After
	public void tearDown()
	{
		System.out.println("After the class");
	}
	// test case 
	@Test(timeout = 10)
	public void testAdd()
	{
	
		
		//assertEquals(4, mathOp.add(2, 2));
	}
	@Test
	//@Ignore
	public void testSub()
	{
		//MathOperations mathOp = new MathOperations();
		
		assertEquals(4, mathOp.sub(8,2));
	}
	@Test(expected = ArithmeticException.class)
	public void testDiv()
	{
		mathOp.div(3, 0);
	}
	@Test
	
	public void testIsEven()
	{
		assertTrue(mathOp.isEven(6));
	}
	
	
	
}
