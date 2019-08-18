package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Output {

	List<Faculty> faculties;

	public Output(List<Faculty> faculties) {
		this.faculties=faculties;
	}
	
	public void PrintFaculties() {
		Iterator<Faculty> facultyIterator = faculties.iterator();
		while(facultyIterator.hasNext()) {
			Faculty faculty = facultyIterator.next();
			System.out.println("========="+faculty.getFacultyName()+ "========");
			printPrograms(faculty.getIterator());
		}
		
	}
	
	public void printPrograms(Iterator iterator) {
		
	    while (iterator.hasNext()) {
			Program program = (Program)iterator.next();
			System.out.println(program.getCode() + " " + program.getName());
		}
		
	}
}

