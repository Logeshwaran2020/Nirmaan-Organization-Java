package Interface;

public class calc implements Calculator{

	@Override
	public void add(int a, int b) {
		System.out.println(a+b);
		
	}

	@Override
	public void sub(int a, int b) {
		System.out.println(a-b);
		
	}

	@Override
	public void mul(int a, int b) {
		System.out.println(a*b);
		
	}

	@Override
	public void div(int a, int b) {
		System.out.println(a/b);
		
	}

	@Override
	public void mod(int a, int b) {
		System.out.println(a%b);
		
	}
	public static void main(String[] args) {
		calc cc = new calc();
		cc.add(25, 56);
		cc.sub(56, 16);
		cc.mul(26, 3);
		cc.div(12, 4);
		cc.mod(45, 5);
	}

}
