package day15;

import java.util.Scanner;

public class UserInter {
	public static void main(String[] args) {
		LibraryManagement lm = new LibraryManagement();
		Scanner mc = new Scanner(System.in);
		boolean work = true;
		
		while (work) {
			
			System.out.println("Enter your choice :");
			System.out.println("1 for add book details :");
			System.out.println("2 for update particular  book details :");
			System.out.println("3 for show book details :");
			System.out.println("4 for update book details :");
			System.out.println("0 for exit :");
			int n =mc.nextInt();
			if (n==1){
				
				System.out.println("Enter your Book id : ");
				int id = mc.nextInt();
				mc.nextLine();
				
				System.out.println("Enter your Book name : ");
				String name= mc.nextLine();
				System.out.println("Enter your Book price : ");
				String price= mc.nextLine();
			
				System.out.println("Enter your Book author : ");
				String author= mc.nextLine();
				
				
				lm = new LibraryManagement(id, name, id, author);
			}
			
			else if (n==2) {
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
				lm.setId(id);
				
				
				}
				else if (key == 2) {
					
					System.out.println("Enter your Book name : ");
					String name= mc.nextLine();
					lm.setName(name);	
				}
				else if (key == 3) {
					System.out.println("Enter your Book price : ");
					Double price= mc.nextDouble();
					lm.setPrice(price);	
					mc.nextLine();
				}
				else if (key == 4) {
					
					System.out.println("Enter your Book author : ");
					String author= mc.nextLine();
					lm.setAuthor(author);
					
				}
				else {
					System.out.println("Thank you");	
				}
				
				
				
			}
			
			else if (n == 3){
				
				System.out.println(lm);
			}
			else if (n==4) {
				System.out.println("Enter your Book id : ");
				int id = mc.nextInt();
				lm.setId(id);
				mc.nextLine();
				
				System.out.println("Enter your Book name : ");
				String name= mc.nextLine();
				lm.setName(name);
				System.out.println("Enter your Book price : ");
				Double price= mc.nextDouble();
				lm.setPrice(price);
				mc.nextLine();
				System.out.println("Enter your Book author : ");
				String author= mc.nextLine();
				lm.setAuthor(author);
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
			
}
	


