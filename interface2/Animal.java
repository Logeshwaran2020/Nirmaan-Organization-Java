package interface2;

public interface Animal {
	String Category= "Living Being";
	
	static boolean isMammal(String name) {
		if((name.equalsIgnoreCase("Dog"))||(name.equalsIgnoreCase("Cat"))||(name.equalsIgnoreCase("Human"))) {
			return true;
		}
		return false;
		
		
	}
	default void speak() {
		System.out.println("Animal Making a Sound");
	}
	abstract void move();
}
