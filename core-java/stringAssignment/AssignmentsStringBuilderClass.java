package stringAssignment;

public class AssignmentsStringBuilderClass {
	public static void main(String[] args) {
		/*
		 Write an application to append the following strings “StringBuffer”, 
		 “is a peer class of String”, “that provides much of “, 
		 “the functionality of strings” using a StringBuffer. 
		 */
		
		//Problem 1
		
		StringBuilder str1 = new StringBuilder("StringBuffer "+"is a peer class of String "+
		                    "that provides much of ");
		str1.append("the functionality of strings ");
		System.out.println(str1);
		
		//OR
		
		StringBuilder str2 = new StringBuilder("StringBuffer ");
		str2.append("is a peer class of String ");
		str2.append("that provides much of ");
		str2.append("the functionality of strings ");
		System.out.println(str2);
		
		/*
		Insert the following string “insert text” into the string “It is used to _ at the specified index position” 
		at the location denoted by the sign _ 
		*/
		
		//Problem 2
		
		StringBuilder str3 = new StringBuilder("It is used to _ at the specified index position");
		str3.insert(14,"insert text");
		System.out.println(str3.toString());
		
		
		/*
		Reverse the following string “This method returns the reversed object on which 
		it was called” 
		using StringBuffer
		*/
		
		//Problem 3
		
		StringBuilder strNew = new StringBuilder("This method returns the reversed object on which it was called");
		strNew.reverse();
		System.out.println(strNew);
		
		
		
		
	}
}
