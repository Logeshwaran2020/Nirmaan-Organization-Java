package day14;

public class book {
	private String name;
	private int id;
	private String author;
	private double price;
	
	public book(String name, int id ,String author ,double price) {
		this.name=name;
		this.id = id;
		this.author=author;
		this.price=price;
		
	}
	public book() {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book name=" + name + ", \nid=" + id + ", \nauthor=" + author + ", \nprice=" + price ;
	}

	
	
	

}
