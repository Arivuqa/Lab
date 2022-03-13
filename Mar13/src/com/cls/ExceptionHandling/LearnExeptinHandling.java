package com.cls.ExceptionHandling;

public class LearnExeptinHandling {
public static void main(String[] args) {
	try
	{
		int a[]= new int[3];
		a[5]=34/0;
	}
catch(ArithmeticException e)

{
System.out.println("Cannot be div by 0");	
}catch(Exception e)
	
	{
	System.out.println("enter with in 3 ");	
	}

}
}
