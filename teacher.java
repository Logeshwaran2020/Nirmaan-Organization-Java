package School;

public class teacher {
	
	int teacherid;
	String teachername;
	double teachersalary;
	long teacherphno;


public teacher(int teacherid, String teachername, double teachersalary, long teacherphno) {
		super();
		this.teacherid = teacherid;
		this.teachername = teachername;
		this.teachersalary = teachersalary;
		this.teacherphno = teacherphno;
	}


public teacher() {
	
}


public int getTeacherid() {
	return teacherid;
}


public void setTeacherid(int teacherid) {
	this.teacherid = teacherid;
}


public String getTeachername() {
	return teachername;
}


public void setTeachername(String teachername) {
	this.teachername = teachername;
}


public double getTeachersalary() {
	return teachersalary;
}


public void setTeachersalary(double teachersalary) {
	this.teachersalary = teachersalary;
}


public long getTeacherphno() {
	return teacherphno;
}


public void setTeacherphno(long teacherphno) {
	this.teacherphno = teacherphno;
}


@Override
public String toString() {
	return "teacher [teacherid=" + teacherid + ", teachername=" + teachername + ", teachersalary=" + teachersalary
			+ ", teacherphno=" + teacherphno + "]";
}




 }