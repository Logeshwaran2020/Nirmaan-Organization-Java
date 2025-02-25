package multithreading;
class classsA {
	public void display() {
		for(int i=0; i<=100;i++) {
			System.out.println("Loki");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
class classsB {
	public void display() {
		for(int i=0; i<=100;i++) {
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

public class MultiThreadingEx4 {
	public static void main(String[] args) {
		classsA c1 = new classsA();
		classsB c2 = new classsB();
		Thread tr1 = new Thread() {
			public void run(){
				c1.display();
				
				
			}
		};
		Thread tr2 = new Thread() {
			public void run(){
				c2.display();
				
				
			}
		};
		tr1.start();
		tr2.start();
	}

}
