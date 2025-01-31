package Assessment1;

import java.util.Scanner;

public class task8 {
	public static void main(String[] args) {
		
	
	Scanner mc = new Scanner(System.in);
	System.out.println("Enter your Year:");
	int n = mc.nextInt();
	if ((n%400==0)||((n%100!=0)&&(n%4==0))) {
		System.out.println("This is Leap Year");
	}
	else{
		System.out.println("This is not a leap year");
	}
	}
}
