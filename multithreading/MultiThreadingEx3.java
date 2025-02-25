package multithreading;
class classL implements Runnable{

	@Override
	public void run() {
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
class classS implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<=100;i++) {
			System.out.println("LS");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

public class MultiThreadingEx3 {
	public static void main(String[] args) {
		classL c1 = new classL();
		classS c2 = new classS();
		Thread tr1 = new Thread(c1);
		Thread tr2 = new Thread(c2);
		tr1.start();
		tr2.start();

		
	}
	

}
