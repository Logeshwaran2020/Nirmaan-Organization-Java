package interface2;

public class Birds implements Animal{

	@Override
	public void move() {
		System.out.println("The birds flies in the sky");
		
	}
	public void speak() {
		System.out.println("The bird says:Chirp Chirp! ");
	}


}
