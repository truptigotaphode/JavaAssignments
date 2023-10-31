package java11Assignment;

public class Java11_01 {

	public static void main(String[] args) {
		
		calcST srt =((int a,int b,int c) -> {
			return (a*b*c/100);
		});
		
		double ans = srt.calcST(2000, 7, 4);
		System.out.println("The SI is "+ ans);
		

	}

}
interface calcST{
	int calcST(int a, int b,int c);
}
