package School;

import java.util.Scanner;



public class studentui {

	
		public static void main(String[] args) {
			student st = new student();
			Scanner mc = new Scanner(System.in);
			boolean studentin = true;
			
			while(studentin) {

				System.out.println("Enter your choice :");
				System.out.println("1 for add student details :");
				System.out.println("2 for update particular  student details :");
				System.out.println("3 for show student details :");
				System.out.println("4 for update student details :");
				System.out.println("0 for exit :");
				int n =mc.nextInt();
				
				
				
				if (n==1){
					
					System.out.println("Enter your student id : ");
					int id = mc.nextInt();
					mc.nextLine();
					
					System.out.println("Enter your student name : ");
					String name= mc.nextLine();
					System.out.println("Enter your student phno : ");
					long price= mc.nextLong();
				
					System.out.println("Enter your student rollno : ");
					int rollno= mc.nextInt();
					
					
					st = new student(id, name, rollno, n);
				}
				
				else if (n==2) {
					System.out.println("Enter your choice :");
					System.out.println("1 for edit student id :");
					System.out.println("2 for edit student name :");
					System.out.println("3 for edit student phno :");
					System.out.println("4 for edit student rollno :");
					System.out.println("0 for exit :");
					int key =mc.nextInt();
					mc.nextLine();
					if (key==1){
					
					System.out.println("Enter your student id : ");
					int id = mc.nextInt();
					st.setStudent_id(id);
					
					
					}
					else if (key == 2) {
						
						System.out.println("Enter your student name : ");
						String name= mc.nextLine();
						st.setStudent_name(name);	
					}
					else if (key == 3) {
						System.out.println("Enter your student phno : ");
						long phno = mc.nextLong();
						st.setStudent_phno(phno);	
						mc.nextLine();
					}
					else if (key == 4) {
						
						System.out.println("Enter your student rollno : ");
						int rollno = mc.nextInt();
						st.setStudent_rollno(rollno);
						
					}
					else {
						System.out.println("Thank you");	
					}
					
					
					
				}
				
				else if (n == 3){
					
					System.out.println(st);
				}
				else if (n==4) {
					System.out.println("Enter your student id  : ");
					int id = mc.nextInt();
					st.setStudent_id(id);
					mc.nextLine();
					
					System.out.println("Enter your student name : ");
					String name= mc.nextLine();
					st.setStudent_name(name);
					System.out.println("Enter your student phno : ");
					long phno = mc.nextLong();
					st.setStudent_phno(phno);	
					mc.nextLine();
					System.out.println("Enter your student rollno : ");
					int rollno = mc.nextInt();
					st.setStudent_rollno(rollno);
					
				}
					
				
				else if (n == 0) {
					studentin = false;
					System.out.println("Thank you");
				}
				else {
					System.out.println("Enter the correct choice");
				}
			}
			}
		}

