package collectionAssignment;

import java.util.*;


public class CollectionFramework {
	public static void main(String[] args) {
		TreeMap <Long,Contact> treemap = new TreeMap<>();
		
		treemap.put(2345678903L,new Contact(2345678903L,"abc","abc@gmail.com",Gender.MALE));
		treemap.put(4536678903L,new Contact(4536678903L,"Tanu" ,"tanu@gmail.com",Gender.FEMALE));
		treemap.put(9345678903L,new Contact(9345678903L,"Kirti" ,"kirti@gmail.com",Gender.FEMALE));
		
		for(Long Phonenumber:treemap.keySet()) {
			System.out.println(Phonenumber);
		}
		
		System.out.println("--------------------");
		
		for(Contact Contact: treemap.values()) {
			System.out.println(Contact);
		}
		
		System.out.println("--------------------");
		
		
		for(Long Phonenumber: treemap.keySet()) {
			System.out.println("Key:"+Phonenumber+"\tValue:"+treemap.get(Phonenumber));
		}

	}

}
enum Gender{
	MALE,FEMALE,OTHER
}

class Contact{
	long PhoneNumer;
	String	Name;
	String	Email;
    Gender  gender;
	public Contact(long phoneNumer, String name, String email, Gender gender) {
		this.PhoneNumer = phoneNumer;
		this.Name = name;
		this.Email = email;
		this.gender = gender;
		
	}
	public long getPhoneNumer() {
		return PhoneNumer;
	}
	public String getName() {
		return Name;
	}
	public String getEmail() {
		return Email;
	}
	public Gender getGender() {
		return gender;
	} 
	
	public String toString() {
		return PhoneNumer+"\t"+Name+"\t"+Email+"\t"+gender;
	}
	

}


