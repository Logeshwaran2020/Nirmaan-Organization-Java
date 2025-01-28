package Inheritance;

public class VehicleUI {
	public static void main(String[] args) {
		//Single Inheritance
		Car cr = new Car();
		cr.startEngine();
		cr.drive();
		
		//Multilevel Inheritance 
		ElectricCar ec = new ElectricCar();
		ec.chargeBattery();
		ec.startEngine();
		ec.drive();
		//Hierarchical Inheritance
		Bike bk = new Bike(); 
		bk.kickStart();
		bk.startEngine();
		
		cr.startEngine();
		cr.drive();
		
		
	}

}
