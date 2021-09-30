package com.mdu005.juit;

import java.util.List;
import java.util.Scanner;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
   Result result = 	JUnitCore.runClasses(MathOperationsTest.class,EmployeeUtilsTest.class);
   

   System.out.println(result.getFailureCount());
   System.out.println(result.getRunCount());
   
  
   List<Failure>  failures =   result.getFailures();
    	
   
     failures.forEach(t->{System.out.println(t.getTestHeader());
        System.out.println(t.getDescription());
        System.out.println(t.getMessage());
        System.out.println(t.getTrace());
     
     });
   
   
   
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.println("Enter any number");
		 * 
		 * int input = sc.nextInt();
		 * 
		 * MathOperations mathOperations = new MathOperations();
		 * 
		 * if(mathOperations.isEven(input)) System.out.println("Given inpu is Even");
		 * else System.out.println("Given input is not even");
		 */
    	       
    	
    }
}
