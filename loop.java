package day4;

import java.util.Scanner;

public class loop {
	public static void main(String[] args) {
		/*
		 * for (int i = 10; i>0;i-=2) { System.out.println(i);
		 */
		Scanner mc = new Scanner(System.in);
		/*
		 * System.out.println("Enter your Table:"); int n = mc.nextInt(); for (int i =
		 * 1;i<=10;i++){ System.out.println(n+" x "+i+" = "+i*n); }
		 * 
		 * for (int i = 1;i<=100;i++) { if (i %5==0) { System.out.println("Loki");
		 * 
		 * 
		 * } else { System.out.println(i);
		 */

		/*
		 * for (int i = 1; i <=100;i++) { if (i == 25) { break; } else {
		 * System.out.println(i); }
		 * 
		 * }
		 */
		/*
		 * for (int i = 1; i <=100;i++) { if (i %5==0) { continue; } else {
		 * System.out.println(i); }
		 * 
		 * }
		 */
		/*for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.print(j);
				

			}
			System.out.println()
			;

		}*/
		/*for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.print("* ");
				

			}
			System.out.println()
			;

		}*/
		/*for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
				

			}
			System.out.println()
			;

		}*/
		Scanner oc = new Scanner(System.in);
		System.out.println("Enter your value:");
		
		int n = oc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
				

			}
			System.out.println()
			;

		}
	}
}
