
public class DemoToString {
	 public static void main(String[] args) {
		 
		 Student s1 = new Student(11, "Rachel");
		 System.out.println(s1.toString());
	 }
}

// class Student extends Object
class Student {
	int rollno;
	String sname;
	
	public Student(int rollno, String sname) {
		this.rollno = rollno;
		this.sname = sname;
	}
	
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	// toString is a build in method for object
	@Override
	public String toString() {
		return  getSname() + ": " + getRollno();
	}
}