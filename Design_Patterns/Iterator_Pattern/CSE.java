package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CSE implements Faculty {
	
	List<Program> programs;
	
	public CSE() {
		programs = new ArrayList<Program>();
		addProgram(3778,"Computer Science");
		addProgram(4444, "Software Engineering");
		addProgram(5555, "Computer Engineering");
	}

	@Override
	public Iterator getIterator() {
		CseIterator iterator = new CseIterator(programs);
		return iterator;
	}

	@Override
	public void addProgram(int code, String name) {
		Program program = new Program(code,name);
		programs.add(program);
	}

	@Override
	public String getFacultyName() {
		return "CSE";
	}

	
	

}
