package com.mdu005.juit;

public class MathOperations {
	
	public  int add(int a, int b)
	{
		return a + b;
	}
	
	public int sub(int a, int b)
	{
		return a - b;
	}

	public boolean isEven(int number)
	{
		 if (number%2 == 0)
			 return true;
		 else
			 return false;
	}
	public int div(int a, int b)
	{
		
		if(b<=0)
		{
			throw new ArithmeticException();
		}
		return a / b;
	}
	
	public int factorial(int number)
	{
		
		 int fact = 1;
		 for (int i = 1; i <= number; i++) {
			
			 fact*=i;
			
		}
		
		return fact;
		
	}
}
