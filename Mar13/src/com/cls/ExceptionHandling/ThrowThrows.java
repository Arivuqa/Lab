package com.cls.ExceptionHandling;

public class ThrowThrows {
public static void main(String[] args) {
	ThrowThrows tt=new ThrowThrows();
	tt.checkmark(0);
}
public void checkmark(int marks) throws ArithmeticException 
{
	if (marks<35 && marks>0 )
		System.out.println("Fail");
	else
		System.out.println("pass");
		}
}
