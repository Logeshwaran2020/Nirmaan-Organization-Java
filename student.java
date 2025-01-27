package School;

public class student {
	int student_id;
	String student_name;
	int student_rollno;
	long student_phno;
	
	public student() {
		
	}

	public student(int student_id, String student_name, int student_rollno, long student_phno) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
		this.student_rollno = student_rollno;
		this.student_phno = student_phno;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public int getStudent_rollno() {
		return student_rollno;
	}

	public void setStudent_rollno(int student_rollno) {
		this.student_rollno = student_rollno;
	}

	public long getStudent_phno() {
		return student_phno;
	}

	public void setStudent_phno(long student_phno) {
		this.student_phno = student_phno;
	}

	@Override
	public String toString() {
		return "student [student_id=" + student_id + ", student_name=" + student_name + ", student_rollno="
				+ student_rollno + ", student_phno=" + student_phno + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
