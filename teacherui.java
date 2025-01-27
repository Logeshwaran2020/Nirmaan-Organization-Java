package School;

import java.util.Scanner;

public class teacherui {
	
	public static void main(String[] args) {
		teacher tec = new teacher();
		Scanner tc = new Scanner(System.in);
		boolean teacherin = true;
		
		while(teacherin){
			System.out.println("Enter your choice :");
			System.out.println("1 for add teacher details :");
			System.out.println("2 for update particular  teacher details :");
			System.out.println("3 for show teacher details :");
			System.out.println("4 for update teacher details :");
			System.out.println("0 for exit :");
			int n =tc.nextInt();
			
			
			switch (n) {
			case 1: {
				System.out.println("Enter your teacher id : ");
				int id = tc.nextInt();
				tc.nextLine();
				
				System.out.println("Enter your teacher name : ");
				String name= tc.nextLine();
				System.out.println("Enter your teacher phno : ");
				long phno= tc.nextLong();
			
				System.out.println("Enter your teacher salary : ");
				double salary= tc.nextDouble();
				
				tec =new teacher(id, name, salary, phno);
					
			}
			break;
			case 2 :{
				System.out.println("Enter your choice :");
				System.out.println("1 for edit teacher id:");
				System.out.println("2 for edit teacher name :");
				System.out.println("3 for edit teacher phno :");
				System.out.println("4 for edit teacher salary :");
				System.out.println("0 for exit :");
				int key =tc.nextInt();
				tc.nextLine();
				if (key==1){
				
				System.out.println("Enter your teacher id : ");
				int id = tc.nextInt();
				tec.setTeacherid(id);
				
				
				}
				else if (key == 2) {
					
					System.out.println("Enter your teacher name : ");
					String name= tc.nextLine();
					tec.setTeachername(name);	
				}
				else if (key == 3) {
					System.out.println("Enter your teacher phno : ");
					long phno = tc.nextLong();
					tec.setTeacherphno(phno);	
					tc.nextLine();
				}
				else if (key == 4) {
					
					System.out.println("Enter your teacher salary : ");
					int rollno = tc.nextInt();
					tec.setTeachersalary(rollno);
					
				}
				else {
					System.out.println("Thank you");	
				}
				
			}
			break;
			
			case 3:{
				System.out.println(tec);
			}
			break;
			case 4:{
				System.out.println("Enter your teacher id  : ");
				int id = tc.nextInt();
				tec.setTeacherid(id);
				tc.nextLine();
				
				System.out.println("Enter your teacher name : ");
				String name= tc.nextLine();
				tec.setTeachername(name);
				System.out.println("Enter your teacher phno : ");
				long phno = tc.nextLong();
				tec.setTeacherphno(phno);	
				tc.nextLine();
				System.out.println("Enter your teacher salary : ");
				int rollno = tc.nextInt();
				tec.setTeachersalary(rollno);
			}
			break;
			case 0:{
				teacherin = false;
				System.out.println("Thank you");
			}
			break;
			default:
				System.out.println("Enter the correct choice");
				
			}
			
		}
	}

}
