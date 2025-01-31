package Assessment1;

import java.util.Scanner;

public class task10 {
public static void main(String[] args) {
	Scanner mc = new Scanner(System.in);
	System.out.println("Enter your name:");
	String nm=mc.nextLine();
	String rs="";
	for (char ch : nm.toCharArray()){
		rs=ch+rs;
	}
	System.out.println(rs);
}
}
