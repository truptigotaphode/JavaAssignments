package annotationsAssignment;

import java.lang.annotation.ElementType; 
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Annotations_02 {
	
	@Info(AuthorID="34D",Date="13/12/2003",Time="10.56 am",Version=4)
	String data ;

}

@Target({ElementType.METHOD,ElementType.FIELD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface Info{
	String AuthorID() ;
	String Author() default " ";
	String Supervisor() default " ";
	String Date ();
	String Time();
	int Version();
	String Description()default " ";
	
}
@Info(AuthorID="34D",Date="13/12/2003",Time="10.56 am",Version=4)
class MyInfo{
	
}

class MyInfo2{
	@Info(AuthorID="30K",Date="3/2/2000",Time="10.30 am",Version=5)
	public void MyInfo_store(){
		
	}
}

