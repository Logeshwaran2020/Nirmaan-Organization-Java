package interface2;

public class Dog implements Animal {

	@Override
	public void move() {
		System.out.println("The dog runs on four legs");
		
	}
	public void speak() {
		System.out.println("The dog says:Woof Woof! ");
	}

}
