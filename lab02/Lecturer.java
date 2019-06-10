package example;

public class Lecturer extends StaffMember {
	private String school;
	private String Academic_Status;
    
	/*
	 * constructor of the Lecturer object
	 * @param school			the school that the lecturer belongs to
	 * @param name				the lecturers name
	 * @param salary    		the salary assigned to the lecturer
	 * @param Academic_Status 	the Academic Status of the lecturer can be "A", "B" or "C"
	 * 
	 */
	public Lecturer(String name, double salary, String school, String Academic_Status) {
		super(name, salary);
		// now we have the structure from the superclass-StaffMember
		// which contains get/set salary/end date/start date
		this.school = school;
		//this.name = name;
		this.salary = salary;
		this.Academic_Status = newAcademic_Status(Academic_Status);
	}
	
	/*
	 * @return 	the information state of the lecturer object
	 */
	@Override
	public String toString() {
		return "Name: " + this.name + "; School: " + this.school + "; Salary: " + this.salary + "; Academic Status: " + this.Academic_Status;
	}
	
	/*
	 * A method to check which Academic Status the lecturer is 
	 * each input has an assigned output
	 * @param Academic_Status	the input/abbreviation of the academic status of the lecturer
	 * @return this method return the real/full tite of the academic status of the lecturer
	 * 
	 */
	public String newAcademic_Status(String Academic_Status) {
		if (Academic_Status.equals("A")) {
			this.Academic_Status = "Associate Lecturer";
		} else if (Academic_Status.equals("B")) {
			this.Academic_Status = "Lecturer";
		} else if (Academic_Status.equals("C")) {
			this.Academic_Status = "Senior Lecturer";
		}
		return this.Academic_Status;
	}
	
	/*
	 * @return which school is the lecturer working for
	 */
	public String getschool() {
		return school;
	}
	/*
	 * @return the academic status input
	 */
	public String getAcademic() {
		return Academic_Status;
	}
	
	/*
	 * this method determines whether a given object is equal to the 
	 * Lecturer object based on name, salary, school, academic status
	 * @param o object we are comparing to Lecturer this
	 * @return true or false depending on the equivalence between parameter object and this Lecturer
	 * 
	 */
	@Override
	public boolean equals(Object o) {
		if (!super.equals(o)) return false;
		Lecturer _o = (Lecturer) o;
		if(school.equals(_o.getschool()) && Academic_Status.equals(_o.getAcademic())) return true;
		return false;
	}

	
}
