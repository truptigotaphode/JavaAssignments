package stringAssignment;

public class AssignmentsStringClass {
	public static void main(String[] args) {
		/*
		 Write an application to determine
		 the length of the String str = “Hello World”. (Hint: Use String method)
		*/
		
		// Problem 1
		
		String str = "Hello World";
		System.out.println("The length of the string is "+ str.length());
		
		
		
		/* Write an application to join the two Strings “Hello, ” 
		   & “How are you?” (Hint: Use String method)
		*/
		
		// Problem 2
		
		String a = "hello, ";
		String b = "How are you?";
		System.out.println(a.concat(b));
		
		
		/* Given a String “Java String pool refers to collection of Strings 
		   which are stored in heap memory”, perform the following operations 
		   (Hint: all operation can be performed using String methods)
           a. Print the string to console in lowercase
           b. Print the string to console in uppercase
           c. Replace all ‘a’ character in the string with $ sign
           d. Check if the original String contains the word “collection”
           e. Check if the following String “java string pool refers to collection
           of strings which are stored in heap memory” matches the original
           f. If the string does not match check if there is another method which 
           can be used to check if the strings are equal
		*/
		
		String str2 = "Java String pool refers to collection of strings which are stored in heap memory";
		System.out.println(str2.toLowerCase());
		System.out.println(str2.toUpperCase());
		System.out.println(str2.replace('a', '$'));
		System.out.println(str2.contains("collection"));
		String str3 = "java string pool refers to collection of strings which are stored in heap memory";
		System.out.println(str2.equals(str3));
		System.out.println(str2.compareTo(str3));//if two strings are equal it will return zero or else it will give the negative index where it is different
		
		
		
		
	}

}
