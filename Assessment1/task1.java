package Assessment1;

import java.util.Scanner;

public class task1 {
	public static void main(String[] args) {
		Scanner mc = new Scanner(System.in);
		System.out.println("Enter your age :");
		int n = mc.nextInt();
		if (n>=18) {
			System.out.println("Eligible");
		}
		else {
			System.out.println("Not Eligible");
			
		}
	}

}
