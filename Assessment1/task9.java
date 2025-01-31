package Assessment1;

import java.util.Scanner;

public class task9 {
	public static void main(String[] args) {
		Scanner mc = new Scanner(System.in);
		System.out.println("Enter your Para:");
		String para = mc.nextLine();
		for (char a : para.toCharArray()) {
			if ((a=='a')||(a=='e')||(a=='i')||(a=='o')||(a=='u')||(a=='A')||
				(a=='E')||(a=='I')||(a=='O')||(a=='U')) {
				continue;
			
				
			}
			else {
				System.out.println(a);
			}
			
			
		}
	}

}
