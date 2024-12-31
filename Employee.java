package day7;

public class Employee {
	int Employeeid;
	String Employeename;
	long Phoneno;
	double Salary;
	
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.Employeename = "Inba";
		emp1.Employeeid = 112426;
		emp1.Phoneno = 9500957568l;
		emp1.Salary = 65000;
		
		Employee emp2 = new Employee();
		emp2.Employeename = "Pedi";
		emp2.Employeeid = 112423;
		emp2.Phoneno = 9500957568l;
		emp2.Salary = 65000;
		
		Employee emp3 = new Employee();
		emp3.Employeename = "Manesh";
		emp3.Employeeid = 112429; 
		emp3.Phoneno = 9500957568l;
		emp3.Salary = 65000;
		
		Employee emp4 = new Employee();
		emp4.Employeename = "Gopi";
		emp4.Employeeid = 112427;
		emp4.Phoneno = 9500957568l;
		emp4.Salary = 65000;
		
		Employee emp5 = new Employee();
		emp5.Employeename = "Loki";
		emp5.Employeeid = 112428;
		emp5.Phoneno = 9500957568l;
		emp5.Salary = 65000;
		
		System.out.println("Employee Name : "+emp1.Employeename+"\nEmployee Id : "+emp1.Employeeid);
		System.out.println("Employee Phoneno : "+emp1.Phoneno);
		System.out.println("Employee Salary : "+emp1.Salary);
		
	}

}
