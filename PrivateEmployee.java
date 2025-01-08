package day13;




public class PrivateEmployee {
	private String EmpName;
	private int Empid;
	private double EmpSalary;
	private long EmpPhno;
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public int getEmpid() {
		return Empid;
	}
	public void setEmpid(int empid) {
		Empid = empid;
	}
	public double getEmpSalary() {
		return EmpSalary;
	}
	public void setEmpSalary(double empSalary) {
		EmpSalary = empSalary;
	}
	public long getEmpPhno() {
		return EmpPhno;
	}
	public void setEmpPhno(long empPhno) {
		EmpPhno = empPhno;
	}
	@Override
	public String toString() {
		return "Employee Name : " + EmpName + "\nEmployee id : " + Empid + "\nEmployee Salary : " + EmpSalary + "\nEmployee Phone no : "
				+ EmpPhno;
	}
	
	
}


	


