package multithreading;
class classsC {
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
class classsD {
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

public class MultiThreadingEx5 {
	public static void main(String[] args) {
		classsC c1 = new classsC();
		classsD c2 = new classsD();
		Runnable r1 = new Runnable() {
			public void run() {
				c1.display();
				
			}
		};
		Runnable r2 = new Runnable() {
			public void run() {
				c2.display();
				
			}
		};
		Thread tr1 = new Thread(r1);
		Thread tr2 = new Thread(r2);
		tr1.start();
		tr2.start();
	}
	
	

}
