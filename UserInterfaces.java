package day13;

public class UserInterfaces {
	
		public static void main(String[] args) {
			PrivateEmployee emp1 = new PrivateEmployee();
			emp1.setEmpName("Mane");
			emp1.setEmpid(152451254);
			emp1.setEmpPhno(4568325421l);
			emp1.setEmpSalary(48500);
			System.out.println(emp1);
			System.out.println();
			
			PrivateEmployee emp2 = new PrivateEmployee();
			emp2.setEmpName("Inba");
			emp2.setEmpid(1524512526);
			emp2.setEmpPhno(438325421l);
			emp2.setEmpSalary(59500);
			System.out.println(emp2);
			System.out.println();
			
			PrivateEmployee emp3 = new PrivateEmployee();
			
			emp3.setEmpName("Gopi");
			emp3.setEmpid(152551254);
			emp3.setEmpPhno(907025421l);
			emp3.setEmpSalary(75500);
			System.out.println(emp3);
			System.out.println();
			
		}
}

