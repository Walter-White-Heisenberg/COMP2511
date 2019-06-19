package unsw.enrolment;

import java.util.List;

public class Enrolment {

    private CourseOffering offering;
    private Grade grade;
    private Student student;

	
    public Enrolment(CourseOffering offering, Student student) {
        this.offering = offering;
        this.student = student;
    }

    public Course getCourse() {
        return offering.getCourse();
    }

    public String getTerm() {
        return offering.getTerm();
    }
    
    public String getStudent() {
    	return student.getZID();
    }

    public String getGrade() {
    	return grade.getGrade();
    }
    
	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	
	
	
    /*
    public void meetRequirement(Course course) {
    	//course = offering.getCourse();
    	//student1 = student;
    	if (course.getPrereqs()!=null && student.finishedCourse()!=null) {
	    	for (Course c : course.getPrereqs()) {
	    		if (!(student.finishedCourse().contains(c))) {
	    			System.out.println("student doesn't meet the requirement to enrol the course");
	    		}
	    	}
    	} else if (student.finishedCourse()==null) {
    		System.out.println("student doesn't meet the requirement to enrol the course");
    	}
    } */
	
}