package day14;

public class ui {
	
	public static void main(String[] args) {
		book bk1 = new book("Marvel",698,"Kevin",2560);
		System.out.println(bk1);
		System.out.println();
		book bk2 = new book();
		bk2.setName("Loki");
		bk2.setId(524);
		bk2.setAuthor("Mane");
		bk2.setPrice(450);
		System.out.println(bk2);
		System.out.println();
		book bk3 = new book("Ben comics",58,"Man of Action",980);
		System.out.println(bk3);
		
	}

}
 