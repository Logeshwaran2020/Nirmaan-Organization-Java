package day15;

public class LibraryManagement {
	int id;
	String name;
	double price;
	String author;

	

public LibraryManagement() {
		
	}

	public LibraryManagement(int id, String name, double price, String author) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.author = author;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public double getPrice() {
		return price;
	}




	public void setPrice(double price) {
		this.price = price;
	}




	public String getAuthor() {
		return author;
	}




	public void setAuthor(String author) {
		this.author = author;
	}




	@Override
	public String toString() {
		return "LibraryManagement [id=" + id + ", name=" + name + ", price=" + price + ", author=" + author + "]";
	}
	
}