package java11Assignment;

import java.util.*;
import java.io.*;
import java.nio.file.Path;

public class Java11_04 {
	public static void main(String[] args) throws Exception{
		
		Path fileName = Path.of("C:\\Users\\HP\\Desktop\\names.txt");
		Scanner sr = new Scanner(fileName);
		int i=0;
		while(sr.hasNext()) {
			System.out.println(sr.next());
			i++;
		}
		System.out.println("The count of students is " + i);
		
	}
}
 