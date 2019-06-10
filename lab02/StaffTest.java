package example;
import java.util.Calendar;
import java.util.Date;

public class StaffTest {
	public String printStaffDetails(StaffMember staff) {
		return staff.toString();
	}
	public static void main(String[] args) {
		StaffTest test = new StaffTest();
		
		StaffMember staff = new StaffMember("John Welch", 20000.34);
		System.out.println(test.printStaffDetails(staff));
		System.out.println("End time: " + staff.EndDate(2019,06,07));
		System.out.println("overriding equal() check: " + staff.equals(staff));
		
		Lecturer teacher = new Lecturer("Florence Huang", 34490.2, "Computer Science and Engineering", "B");
		System.out.println(test.printStaffDetails(teacher));
		System.out.println("Hire time: " + teacher.HireDate(1998,10,19));
		System.out.println("overriding equal() check: " + teacher.equals(teacher));
	}
}
