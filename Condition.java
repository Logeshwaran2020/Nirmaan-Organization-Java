package day3;

import java.util.Scanner;



public class Condition {
	public static void main(String[] args) {
		Scanner mc = new Scanner (System.in);
		/*System.out.println("Enter your Mark:");
		int stdMark = mc.nextInt();
		if ((stdMark>=35)&&(stdMark<=100)) {
			if(stdMark>=90){
				System.out.println("Grade A");
			}
			else if(stdMark>=80) {
				System.out.println("Grade B");
			}
				
			else {
				System.out.println("Grade C");
			}
			}
		else if (stdMark>100) {
			System.out.println("Invalid Number");
			
		}
		else {
			System.out.println("Fail");
		}*/
		System.out.println("Enter your choice: ");
		
		System.out.println("1 for Addition");
		System.out.println("2 for Subtraction");
		System.out.println("3 for Multiply");
		System.out.println("4 for Division");
		System.out.println("5 for Modulus");
		int key = mc.nextInt();
		switch (key) {
		case 1: {
		System.out.println("Enter first number");
		int fnum = mc.nextInt();
		System.out.println("Enter second number");
		int snum = mc.nextInt();
		System.out.println("Addition:"+(fnum+snum));	
		break;
		}
		case 2: {
			System.out.println("Enter first number");
			int fnum = mc.nextInt();
			System.out.println("Enter second number");
			int snum = mc.nextInt();
			System.out.println("Subtraction:"+(fnum-snum));	
			break;
			}
		case 3: {
			System.out.println("Enter first number");
			int fnum = mc.nextInt();
			System.out.println("Enter second number");
			int snum = mc.nextInt();
			System.out.println("Multiplication:"+(fnum*snum));	
			break;
			}
		case 4: {
			System.out.println("Enter first number");
			int fnum = mc.nextInt();
			System.out.println("Enter second number");
			int snum = mc.nextInt();
			System.out.println("Division:"+(fnum/snum));	
			break;
			}
		case 5: {
			System.out.println("Enter first number");
			int fnum = mc.nextInt();
			System.out.println("Enter second number");
			int snum = mc.nextInt();
			System.out.println("Modulus:"+(fnum%snum));	
			break;
			}
		
		default:
			System.out.println("Invalid Number");
		}
		
	}
	

}
