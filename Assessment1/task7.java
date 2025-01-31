package Assessment1;

import java.util.Scanner;

public class task7 {
	public static void main(String[] args) {
		int all = 0;
		Scanner mc = new Scanner(System.in);
		System.out.println("Enter your Subjects : ");
		int n = mc.nextInt();
		for (int i=0;i<n;i++) {
			System.out.println("Enter your mark: ");
			int m = mc.nextInt();
			all+=m;
		}
		
		System.out.println("Total Marks:"+all);
		
		
		System.out.println("Average :"+(all/n));
	}

}
