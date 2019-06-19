package unsw.enrolment.test;

import java.time.DayOfWeek;
import java.time.LocalTime;

import unsw.enrolment.*;


public class EnrolmentTest {

    //private static final DayOfWeek  = null;

	public static void main(String[] args) {
		EnrolmentSystem enrolSystem = new EnrolmentSystem();
		
        // Create courses
        Course comp1511 = new Course("COMP1511", "Programming Fundamentals", 6);
        Course comp1531 = new Course("COMP1531", "Software Engineering Fundamentals", 6);
        comp1531.addPrereq(comp1511);
        Course comp2521 = new Course("COMP2521", "Data Structures and Algorithms", 6);
        comp2521.addPrereq(comp1511);
        enrolSystem.addCourses(comp2521);
        enrolSystem.addCourses(comp1511);
        enrolSystem.addCourses(comp1531);
        enrolSystem.displayCourses();
        

        CourseOffering comp1511Offering = new CourseOffering(comp1511, "19T1");
        CourseOffering comp1531Offering = new CourseOffering(comp1531, "19T1");
        CourseOffering comp2521Offering = new CourseOffering(comp2521, "19T2");

        // TODO Create some sessions for the courses
        Session comp1511lab = new Lab("K17 Tabla Lab", DayOfWeek.MONDAY, LocalTime.of(14, 30), LocalTime.of(16, 30), "Alex", "Kate");
        Session comp1511tut = new Tutorial("Quad G044", DayOfWeek.MONDAY, LocalTime.of(13, 30), LocalTime.of(14, 30), "Alex");
        
        Session comp1531lab = new Lab("K17 String Lab", DayOfWeek.THURSDAY, LocalTime.of(14, 00), LocalTime.of(16, 00), "Adam", "Wil");
        Session comp1531tut = new Tutorial("Main G101", DayOfWeek.THURSDAY, LocalTime.of(13, 00), LocalTime.of(14, 00), "Adam");
        
        Session comp2521lab = new Lab("Piano Lab", DayOfWeek.MONDAY, LocalTime.of(10, 30), LocalTime.of(12, 30), "Lyn", "Frea");
        Session comp2521tut = new Tutorial("Quad 1047", DayOfWeek.MONDAY, LocalTime.of(9, 30), LocalTime.of(10, 30), "Lyn");
        Session comp2521lec = new Lecture("Physics Theatre", DayOfWeek.FRIDAY, LocalTime.of(10, 00), LocalTime.of(12, 00), "John");
        
        // TODO Create a student
        Student Kevin = new Student("z1234567");
        enrolSystem.addStudents(Kevin);
        
        // TODO Enrol the student in COMP1511 for T1 (this should succeed)
        enrolSystem.checkPrereqs(Kevin, comp1511);
        Enrolment Kevin1511 = new Enrolment(comp1511Offering, Kevin);
        enrolSystem.addEnrolments(Kevin1511);
        
        // TODO Enrol the student in COMP1531 for T1 (this should fail as they
        // have not met the prereq)
        enrolSystem.checkPrereqs(Kevin, comp1531);
        // output: The preRequest: COMP1511 is incomplete
        
        // TODO Give the student a passing grade for COMP1511
        enrolSystem.giveMark(Kevin, comp1511, 50, "PS");
        enrolSystem.displayEnrolments();
        enrolSystem.passCourse(Kevin1511);
        enrolSystem.displayCompleteCourse(Kevin);
        
        // TODO Enrol the student in 2521 (this should succeed as they have met
        // the prereqs)
        enrolSystem.checkPrereqs(Kevin, comp2521);
        Enrolment Kevin2521 = new Enrolment(comp2521Offering, Kevin);
        enrolSystem.addEnrolments(Kevin2521);
        enrolSystem.displayEnrolments();
        enrolSystem.displayCompleteCourse(Kevin);
        enrolSystem.giveMark(Kevin, comp2521, 60, "PS");
        enrolSystem.passCourse(Kevin2521);
        enrolSystem.displayCompleteCourse(Kevin);
    }
}
