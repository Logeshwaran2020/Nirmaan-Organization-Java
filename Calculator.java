package day7;

public class Calculator {
	int firstnum;
	int secondnum;
	
	void add() {
		System.out.println("Add : "+(firstnum+secondnum));
	}
	void sub() {
		System.out.println("Sub : "+(firstnum-secondnum));
	}
	void mul() {
		System.out.println("Multiply : "+(firstnum*secondnum));
	}
	void div() {
		System.out.println("Division : "+(firstnum/secondnum));
	}
	void mod() {
		System.out.println("Modulas : "+(firstnum%secondnum));
	}
	public static void main(String[] args) {
		Calculator calc1=new Calculator();
		calc1.firstnum=25;
		calc1.secondnum=12;
		calc1.add();
		calc1.sub();
		calc1.mul();
		calc1.div();
		calc1.mod();

		
	}

}
