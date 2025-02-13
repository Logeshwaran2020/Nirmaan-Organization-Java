package LibraryManagementList;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryUI {
public static void main(String[] args) {
	Library lb = new Library();
	Scanner mc = new Scanner(System.in);
	ArrayList<Library> al = new ArrayList<Library>();
	boolean iswork = true;
	while(iswork) {
		System.out.println("Enter your choice : ");
		System.out.println("1 for add book details : ");
		System.out.println("2 for show book details : ");
		System.out.println("3 for update book details : ");
		System.out.println("4 for remove book : ");
		System.out.println("5 for exit : ");
		int key = mc.nextInt();
		if (key == 1){
			System.out.println("Enter your book id :");
			int bookid = mc.nextInt();
			mc.nextLine();
			System.out.println("Enter your book name : ");
			String bookname = mc.nextLine();
			System.out.println("Enter your book author : ");
			String author = mc.nextLine();
			System.out.println("Enter your book price : ");
			double price = mc.nextDouble();
			lb = new Library(bookid, bookname, author, price);
			al.add(lb);
			
			
		}else if(key == 2) {
			System.out.println(al);
		}
		else if (key == 3) {
			System.out.println("Enter your book id : ");
			int bookid = mc.nextInt();
			mc.nextLine();
			boolean isthere = false;
			for (Library lbi : al) {
				if (lbi.getBookid() == bookid) {
					lbi.setBookid(bookid);
					System.out.println("Enter your book name : ");
					String bookname = mc.nextLine();
					lbi.setBookname(bookname);
					System.out.println("Enter your book author : ");
					String author = mc.nextLine();
					lbi.setAuthor(author);
					System.out.println("Enter your book price : ");
					double price = mc.nextDouble();
					lbi.setPrice(price);
					isthere = true;
					
				}
			}
			if(!isthere) {
				System.out.println("Not there");
			}
		}
			else if (key == 4) {
				System.out.println("Enter your book id : ");
				int bookid = mc.nextInt();
				mc.nextLine();
				boolean isthere = false;
				for (Library lbi:al) {
					if (lbi.getBookid()==bookid) {
						isthere = true;
						al.remove(lbi);
						break;
						 
					}
					if(!isthere) {
						System.out.println("Not found");
					}
				}
			}
			else if (key==5) {
				iswork = false;
				System.out.println("Thank you");
			}
				
	}
	
}
}
