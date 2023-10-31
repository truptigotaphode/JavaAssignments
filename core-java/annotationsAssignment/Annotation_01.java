package annotationsAssignment;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Test{
	
}
class Student{
	String name;
	int age;
	
	@Test
	public void Student(String name,int age) {
		this.name = this.name.toUpperCase();
		this.age = age;
	}
}
public class Annotation_01 {

	public static void main(String[] args) {
		
		Student st = new Student();
	}

}