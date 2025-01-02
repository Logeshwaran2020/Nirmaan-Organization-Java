package day9;

import java.util.Scanner;

public class UserInter {
	public static void main(String[] args) {
		Calclator cl = new Calclator();
		Scanner bc = new Scanner(System.in);
		System.out.println("Enter the First Number : ");
		int fnum = bc.nextInt();
		System.out.println("Enter the Second Number : ");
		int snum = bc.nextInt();
		System.out.println("Addition : "+cl.add(fnum, snum));
		System.out.println("Subtraction : "+cl.sub(fnum, snum));
		System.out.println("Multiplication : "+cl.mul(fnum, snum));
		System.out.println("Division : "+cl.div(fnum, snum));
		System.out.println("Modulas : "+cl.mod(fnum, snum));
	}

}
