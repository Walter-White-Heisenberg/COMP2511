package example;

/**
 * A staff member
 * @author Robert Clifton-Everest
 *
 */
import java.util.Calendar;
import java.util.Date;
public class StaffMember {
	// attribute: name, salary, hire date, end date..
	public String name;
	protected double salary;
	protected Date HireDate;
	protected Date EndDate;
	
	/* constructor for StaffMember object
	 * 
	 * @param name		name of the StaffMember
	 * @param salary	salary that assigned to the StaffMember
	 */
	
	public StaffMember (String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	/* this method HireDate returns the date of when the StaffMember got hired
	 * 
	 *  @param Hyear	Year of when the Staff got hired
	 *  @param Hmonth	Month of when the Staff got hired
	 *  @param Hday		Day of when the Staff got hired
	 *  
	 *  @return the date of when the Staff got hired, date format
	 */
	public Date HireDate(int Hyear, int Hmonth, int Hday) {
		Calendar hireDate = Calendar.getInstance();
		hireDate.set(Hyear, Hmonth, Hday);
		Date HireDate = hireDate.getTime();
		return HireDate;
	}
	
	/* this method HireDate returns the date of when the StaffMember leaves
	 * 
	 *  @param Eyear	Year of when the Staff left
	 *  @param Emonth	Month of when the Staff left
	 *  @param Eday		Day of when the Staff left
	 *  
	 *  @return the date of when the Staff left, date format
	 */
	public Date EndDate(int Eyear, int Emonth, int Eday) {
		Calendar endDate = Calendar.getInstance();
		endDate.set(Eyear, Emonth, Eday);
		Date EndDate = endDate.getTime();
		return EndDate;
	}
	
	/*
	 * @return the information state of the StaffMember object
	 */
	@Override
	public String toString() {
		return "Name: " + this.name + "; Salary: " + this.salary;
	}
	
	/* 
	 * @return the name of the Staff object
	 */
	public String getname() {
		return name;
	}
	
	/*
	 * @return the salary assigned to the StaffMember
	 * this method is used as a getter
	 * 
	 */
	public double getSalary() {
		return salary;
	}
	
	/*
	 * this method used as a setter, to set the salary assigned to the StaffMember object
	 * @param salary	the salary is going to assign to the StaffMember
	 */
	public void setSalary (double salary) {
		this.salary = salary;
	}
	
	/*
	 * a method to check if one object is equal to this StaffMember object
	 * @return true or false depends on the result (parameter)
	 * @param o object we wish to compare to this Employee object
	 * 
	 */
	@Override
	public boolean equals(Object o) {
		if (o == null) return false;
		if (!(o instanceof StaffMember)) return false;
		StaffMember _o = (StaffMember) o;
		if (name.equals(_o.getname()) && _o.getSalary()==salary) return true;
		return false;
	}
}
