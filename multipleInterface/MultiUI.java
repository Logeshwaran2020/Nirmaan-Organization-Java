package multipleInterface;

public class MultiUI implements Calculator1{

	@Override
	public void add(int a, int b) {
		System.out.println("Addition: " + (a+b));
	}

	@Override
	public void sub(int a, int b) {
		System.out.println("Subtraction: " + (a+b));
		
	}

	@Override
	public void mul(int a, int b) {
		System.out.println("Multplication: " + (a+b));
		
	}

	@Override
	public void div(int a, int b) {
		System.out.println("Division: " + (a+b));
	}
	
	

	public static void main(String[] args) { 
		  
		MultiUI calci=new MultiUI();
		Calculator1.display();
		calci.add(10, 20);
		calci.sub(30, 40);
		calci.mul(50,70);
		calci.div(69, 57);
		calci.subtraction();
		
	    System.out.println(Calculator1.NUM);
		
	
	}
	
}