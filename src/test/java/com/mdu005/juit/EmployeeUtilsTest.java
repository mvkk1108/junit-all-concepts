package com.mdu005.juit;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeUtilsTest {

	@Test
	public void testGetEmployee() {
		EmployeeUtils emputils = new EmployeeUtils();
	//	assertEquals(new Employee(101, "krishna", 24, 20000.00),emputils.getEmployee());

	//assertNotNull(emputils.getEmployee());
	assertNull(emputils.getEmployee());
	
	}

}
