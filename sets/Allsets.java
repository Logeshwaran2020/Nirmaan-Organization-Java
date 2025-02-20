package sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.TreeSet;

class employee implements Comparable<employee>{
	int id;
	String name;
	public employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "employee [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		employee other = (employee) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

	@Override
	public int compareTo(employee o) {
		// TODO Auto-generated method stub
		
		if (this.id<o.id) {
			return -1;
			
		}
		else if(this.id>o.id) {
			return 1;
		}
		return 0;
	}
	
	
}

public class Allsets {
	public static void main(String[] args) {
		HashSet<employee> hl = new HashSet<employee>(); 
		employee emp = new employee(1, "loki");
		hl.add(emp);
		employee emp1 = new employee(2, "loki");
		hl.add(emp1);
		
		
		LinkedHashSet<employee> ls = new LinkedHashSet<employee>();
		employee emp3 = new employee(1,"loki");
		ls.add(emp3);
		employee emp7 = new employee(7,"Sanjiv");
		ls.add(emp7);
		employee emp4 = new employee(2,"Sanjiv");
		ls.add(emp4);
		employee emp5 = new employee(3,"Sanjiv");
		ls.add(emp5);
		employee emp6 = new employee(4,"Sanjiv");
		ls.add(emp6);
		
		System.out.println( ls);
		
		TreeSet<employee> ts = new TreeSet<employee>();
		employee emp8 = new employee(1,"loki");
		ts.add(emp8);
		employee emp9 = new employee(7,"Sanjiv");
		ts.add(emp9);
		employee emp45 = new employee(2,"Sanjiv");
		ts.add(emp45);
		employee emp63 = new employee(3,"Sanjiv");
		ts.add(emp63);
		employee emp99 = new employee(4,"Sanjiv");
		ts.add(emp99);
		System.out.println(ts);
		
		
		
		
	}
	

}
