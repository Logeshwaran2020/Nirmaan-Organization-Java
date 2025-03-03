package ProjectforLibraryManagement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

import ArrayList.arrayListEx;



class book implements Serializable{
	int id;
	String name;
	double price;
	String author;
	public book(int id, String name, double price, String author) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.author = author;
	}
	public book() {
		super();
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
		return "book [id=" + id + ", name=" + name + ", price=" + price + ", author=" + author + "]";
	}
	
}

public class BooksProject  {
	public static void main(String[] args) {
		book bk = new book();
		String path= "C:\\Users\\Nirmaan\\Desktop\\Loki_Project\\loki.txt";
		ArrayList<book> al = new ArrayList<book>(); 
		Scanner mc = new Scanner(System.in);
		boolean work = true;
		
		
		
		while (work) {
			
			System.out.println("Enter your choice :");
			System.out.println("1 for add book details :");
			System.out.println("2 for update particular  book details :");
			System.out.println("3 for show book details :");
			System.out.println("4 for update book details :");
			System.out.println("5 for delete book  :");
			System.out.println("0 for exit :");
			int n =mc.nextInt();
			if (n==1){
				al=readFile(path);
				
				System.out.println("Enter your Book id : ");
				int id = mc.nextInt();
				mc.nextLine();
				
				System.out.println("Enter your Book name : ");
				String name= mc.nextLine();
				System.out.println("Enter your Book price : ");
				String price= mc.nextLine();
			
				System.out.println("Enter your Book author : ");
				String author= mc.nextLine();
				
				
				bk = new book(id, name, id, author);
				
				al.add(bk);
				 writeFile(path,al);

			}
			
			else if (n==2) {
				al=readFile(path);
				
				System.out.println("Enter your choice :");
				System.out.println("1 for add book id :");
				System.out.println("2 for add book name :");
				System.out.println("3 for add book price :");
				System.out.println("4 for add book author :");
				System.out.println("0 for exit :");
				int key =mc.nextInt();
				mc.nextLine();
				if (key==1){
				
				System.out.println("Enter your Book id : ");
				int id = mc.nextInt();
				bk.setId(id);
				
				
				}
				else if (key == 2) {
					
					System.out.println("Enter your Book name : ");
					String name= mc.nextLine();
					bk.setName(name);	
				}
				else if (key == 3) {
					System.out.println("Enter your Book price : ");
					Double price= mc.nextDouble();
					bk.setPrice(price);	
					mc.nextLine();
				}
				else if (key == 4) {
					
					System.out.println("Enter your Book author : ") ;
					String author= mc.nextLine();
					bk.setAuthor(author);
					
				}
				else {
					System.out.println("Thank you");	
				}
				
				 writeFile(path,al);
				
			}
			
			else if (n == 3){
				
				al=readFile(path);
				System.out.println(al);
			}
			else if (n==4) {
				al=readFile(path);
				System.out.println("Enter your Book id : ");
				int id = mc.nextInt();
				bk.setId(id);
				mc.nextLine();
				
				System.out.println("Enter your Book name : ");
				String name= mc.nextLine();
				bk.setName(name);
				System.out.println("Enter your Book price : ");
				Double price= mc.nextDouble();
				bk.setPrice(price);
				mc.nextLine();
				System.out.println("Enter your Book author : ");
				String author= mc.nextLine();
				bk.setAuthor(author);
				writeFile(path,al);
			}
			else if (n==5) {
				al = readFile(path);
				System.out.println("Enter your book id :");
				int id = mc.nextInt();
				
				for(book rebk : al) {
					if (rebk.getId()==id) {
						al.remove(rebk);
						System.out.println("Book deleted");
						break;
					}
				}
				writeFile(path,al);
			}
				
			
			else if (n == 0) {
				work = false;
				System.out.println("Thank you");
			}
			else {
				System.out.println("Enter the correct choice");
			}
		}
			
			
	}

	
	private static void writeFile(String path ,ArrayList<book> al) {
		
		try {
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(al);
			oos.close();
			fos.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}


	private static ArrayList<book> readFile(String path) {
		ArrayList<book> al = new ArrayList<book>();
		try {
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			al=(ArrayList<book>) ois.readObject();
			ois.close();
			fis.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Your file is empty ready to store");
		}
		return al;
	}


}
