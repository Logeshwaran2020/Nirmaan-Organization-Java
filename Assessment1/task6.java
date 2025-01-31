package Assessment1;

import java.util.Scanner;

public class task6 {
	public static void main(String[] args) {
		Scanner mc = new Scanner(System.in);
		System.out.println("Enter your mark:");
		int n = mc.nextInt();
		if((n >=35)&&(n<=100)){
			System.out.println("Pass");
		}
		else {
				System.out.println("Fail");
			}
			
		}
	}


