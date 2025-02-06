package BankManagement;

import java.util.Scanner;

public class bankUI {
	public static void main(String[] args) {
		Scanner mc = new Scanner(System.in);
		Bank bank = new Bank();
		
		
		System.out.println("Enter your pin:");
		int pin1 = mc.nextInt();
		
		if (pin1==bank.getPin()) {
			boolean iswork = true;
			while(iswork) {
				System.out.println("Enter your choice:");
				System.out.println("1 for add money");
				System.out.println("2 for withdraw money");
				System.out.println("3 for Show balance");
				System.out.println("4 for Show all details");
				System.out.println("0 for exit ");
				int key = mc.nextInt();
				if (key==1) {
					System.out.println("Enter your amount");
					double amount1=mc.nextDouble();
					
					bank.setAmount(bank.getAmount()+amount1);
					
				}
				else if (key==2) {
					System.out.println("Enter your amount");
					double amount1=mc.nextDouble();
					if (bank.getAmount()>=amount1) {
						bank.setAmount(bank.getAmount()-amount1);
					}
					else {
						System.out.println("Insufficient Money");
					}
					
				}
				else if (key==3) {
					System.out.println(bank.getAmount());
				}
				else if (key==4) {
					System.out.println(bank);
				}
				else if (key==0) {
					iswork=false;
					System.out.println("Thank you!");
				}
				else {
					System.out.println("Invalid NUmber");
				}
			
		}	
		}
		else{
			System.out.println("Enter the correct pin:");
		}
		
	}

}
