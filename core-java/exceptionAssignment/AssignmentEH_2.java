package exceptionAssignment;

import java.util.Scanner;

public class AssignmentEH_2 {
public static void main(String[] args) {
		
		/*
		Carrying forward with the above problem, handle ArithmeticException by raising
		UnsupportedOperationException as a solution.
		*/
		
		//Problem 2
		
		
		try {
			
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number a : ");
		int  a = sc.nextInt();
		
		System.out.println("Enter second number b : ");
		int b = sc.nextInt();
		
	    
	    
	    	if(b==0){
	    		throw new UnsupportedOperationException("Error: Division by zero is not allowed");
	    	}
	    	else {
	    		int c = a/b ;
	    		System.out.println("The result is: "+ c);
	    	}
	    		
		}catch(UnsupportedOperationException e){
			System.out.println(e.getMessage());
	    }
	    	
	    
	     
	}
}
