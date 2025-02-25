package multithreading;
interface ex1 {
	void add();
	void sub();
}


public class MultiThreadingsex1 {
	public static void main(String[] args) {
		ex1 ex = new ex1() {

			@Override
			public void add() {
				// TODO Auto-generated method stub
				System.out.println(100+52);
			}

			@Override
			public void sub() {
				// TODO Auto-generated method stub
				System.out.println(45-25);
			}
	
		};
		ex.add();
		ex.sub();
	}
	


}
