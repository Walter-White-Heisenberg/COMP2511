package unsw.enrolment;
import java.util.ArrayList;

public class Student {

    private String zid;
    private ArrayList<Enrolment> enrolments;
    private ArrayList<Course> finishedCourse;

	public Student(String zid) {
        this.zid = zid;
        enrolments = new ArrayList<>();
        finishedCourse = new ArrayList<>();
    }

	public String getZID() {
		return zid;
	}
	
	public ArrayList<Enrolment> getEnrolments() {
		return enrolments;
	}
	

	public ArrayList<Course> finishedCourse() {
		return finishedCourse;
	}
	
	public void addFinishedCourse(Course course) {
		finishedCourse.add(course);
	}
	
}
