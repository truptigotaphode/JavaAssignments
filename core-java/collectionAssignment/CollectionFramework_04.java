package collectionAssignment;

import java.time.LocalDate;
import java.util.*;

public class CollectionFramework_04 {
	public static void main(String[] args) {
		
		LinkedList<LocalDate> dateOfBirth = new LinkedList<>();
		dateOfBirth.add(LocalDate.of(2000, 12, 23));
		dateOfBirth.add(LocalDate.of(2001, 12, 23));
		
		for(LocalDate dob:dateOfBirth) {
			int year = dob.getYear();
			boolean isLeapYear = dob.isLeapYear() ;
		
			System.out.println("Your date of birth is "+ dob );
			if(isLeapYear) {
				System.out.println("and it was a leap year");
			}else {
				System.out.println("and it was not a leap year");
			}
		}
		
	}
}
