package unsw.enrolment;

import java.util.ArrayList;
import java.util.List;
public class EnrolmentSystem {
	private ArrayList<Course> courses;
	private ArrayList<Student> students;
	private ArrayList<Enrolment> enrolments;
	private final List<String> passGrade = List.of("PS","CR","DN","HD");
	
	public EnrolmentSystem() {
		courses = new ArrayList<>();
		students = new ArrayList<>();
		enrolments = new ArrayList<>();
	}
	
	public void addCourses(Course course) {
		courses.add(course);
	}
	public void addStudents(Student student) {
		students.add(student);
	}
	public void addEnrolments(Enrolment enrolment) {
		enrolments.add(enrolment);
	}
	
	public void displayEnrolments() {
		System.out.println("enrolment list: ");
		for(Enrolment enrolment : enrolments) {
			System.out.println("student: " + enrolment.getStudent() + "; course: " + enrolment.getCourse().getCourseCode());
		}
	}
	
	public void displayCourses() {
		System.out.println("available courses: ");
		for (Course course : courses) {
			System.out.println(course.getCourseCode());
		}
	}
	
	public void giveMark(Student student, Course course, int mark, String grade) {
		Grade newGrade = new Grade(mark, grade);
		for (Enrolment enrolment : enrolments) {
			if (enrolment.getStudent()==student.getZID() && enrolment.getCourse()==course) {
				enrolment.setGrade(newGrade);
			}
		}
	}
	
	public void displayCompleteCourse(Student student) {
		System.out.println("student completed courses: ");
		for (Course course : student.finishedCourse()) {	
			System.out.println(course.getCourseCode());
		}
	}
	
	public void checkPrereqs(Student student, Course course) {
		if (course.getPrereqs().isEmpty()) {
			System.out.println("available to enrol the course");
		} else if (!(course.getPrereqs().isEmpty()) && student.finishedCourse().isEmpty()) {
			for(Course prerequest : course.getPrereqs()) {
				System.out.println("The preRequest: " + prerequest.getCourseCode() + " is incomplete");
			}
		} else if (!(course.getPrereqs().isEmpty()) && !(student.finishedCourse().isEmpty())) {
			for(Course prerequest : course.getPrereqs()) {
				for (Course completed : student.finishedCourse()) {
					if (prerequest != completed) {
						System.out.println("The preRequest: " + prerequest.getCourseCode() + " is incomplete");
					} else {
						System.out.println("preRequest course: " + prerequest.getCourseCode() + " has complete");
					}
				}
			}
		}
	}
	
	public void passCourse(Enrolment enrolment) {
		for (Student student : students) {
			if (enrolment.getStudent() == student.getZID()) {
				for (String passgrade : passGrade) {
					if(passgrade == enrolment.getGrade()) {
						student.addFinishedCourse(enrolment.getCourse());
					}
				}
			}
		}
	}
	
	
	public ArrayList<Course> getCourses() {
		return courses;
	}
	public ArrayList<Student> getStudents() {
		return students;
	}
	public ArrayList<Enrolment> getEnrolments() {
		return enrolments;
	}
}


