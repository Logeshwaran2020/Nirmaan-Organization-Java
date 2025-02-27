package MultiThreadingEx2;

@FunctionalInterface
interface empty{
	void add(int a , int b);
	
		
	
	
}
public class LambdaEx1{
	public static void main(String[] args) {
		empty a = (c,d)->System.out.println(c+d);
		a.add(112, 120);
	}
	

}
