package interface2;

public class Animalui {
	public static void main(String[] args) {
		Dog dg =new Dog();
		Birds bd= new Birds();
		dg.move();
		dg.speak();
		bd.move();
		bd.speak();
		System.out.println(Animal.isMammal("dog"));
		System.out.println(Animal.isMammal("bird"));
		System.out.println(Animal.Category );
		
		
		 
	}

}
