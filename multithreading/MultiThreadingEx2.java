package multithreading;

import java.util.Scanner;

class classa extends Thread{
	public void run() {
		for(int i = 0; i<=100;i++) {
			System.out.println("loki");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class classc extends Thread{
	public void run() {
		for(int i = 0; i<=100;i++) {
			System.out.println("honey");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class classb extends Thread{
	public void run() {
		for(int i = 0; i<=100;i++) {
			System.out.println("Swetha");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
	}
class classd extends Thread{
	public void run() {
		for(int i = 0; i<=100;i++) {
			System.out.println("tamil");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class MultiThreadingEx2 {
	public static void main(String[] args) {
		classa c1 = new classa();
		classb c2 = new classb();
		classc c3 = new classc();
		classd c4 = new classd();
		
		
		c3.start();
		c4.start();
		
	}

}
