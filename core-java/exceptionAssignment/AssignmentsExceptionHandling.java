package exceptionAssignment;

import java.util.Scanner;

public class AssignmentsExceptionHandling {
public static void main(String[] args) {
		
		/*
		Write an application that accepts two numbers, divides the first number with the second
		number and display the result. Hint: You need to handle ArithmeticException which is
		thrown when there is an attempt to divide a number by zero.
		*/
		
		//Problem 1  
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number a : ");
		int a = sc.nextInt();
		System.out.println("Enter second number b : ");
		int b = sc.nextInt();

	    try {
	    	int c = a/b ;
	    	System.out.println("The result is: "+ c);
		}catch(ArithmeticException e){
			System.out.println("Exception occurred: "+e.getMessage());
			System.out.println("Please..Check your code!");
			
		} 
	
		
	}
}
