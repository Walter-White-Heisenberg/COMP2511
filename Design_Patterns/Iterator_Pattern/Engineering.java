package Iterator;

import java.util.Iterator;

public class Engineering implements Faculty{
	
	Program[] programs;
	int index = 0;
	
	public Engineering() {
		programs = new Program[3];
		addProgram(1223, "Civil Engineering");
		addProgram(2222, "Mechanical Engineering");
		addProgram(3333, "Material Science and Engineering");
		
	}
	
	
	@Override
	public Iterator getIterator() {
		EngineeringIterator iterator = new EngineeringIterator(programs);
		return iterator;
	}

	@Override
	public void addProgram(int code, String name) {
		Program program = new Program(code, name);
		programs[index] = program;
		index = index + 1;
	}

	@Override
	public String getFacultyName() {
		return "Engineering";
	}

}
