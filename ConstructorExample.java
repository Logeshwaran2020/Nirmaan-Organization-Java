package day10;

public class ConstructorExample {
	int car_id;
	String car_name;
	
	ConstructorExample(int car_id,String car_name){
		this.car_id=car_id;
		this.car_name = car_name;
	}
	ConstructorExample(){
		
	}
	public static void main(String[] args) {
		ConstructorExample car1 = new ConstructorExample(0707,"Ferari");
		ConstructorExample car2 = new ConstructorExample();
		car2.car_id=7070;
		car2.car_name="Honda";
		System.out.println(car1.car_id+"     "+car1.car_name);
		System.out.println(car2.car_id+"     "+car2.car_name);
	}
}
