package MultiThreadingEx2;
class First {
	public synchronized void table(int a ) {
		for(int i=1 ; i<=10; i++) {
			System.out.println(a+"X"+i+"="+i*a);
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
		First f1 = new First();
		
	
		Thread tr1 = new Thread() {
			public void run() {
				f1.table(7);
			}
		};
		
		System.out.println(tr1.getState());
		
		Thread tr2 = new Thread() {
			public void run() {
				f1.table(8);
			}
		};
		
		tr1.start();
		System.out.println(tr1.getState());
		  
		
		
		
	}

}
