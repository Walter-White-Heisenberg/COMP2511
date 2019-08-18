package Iterator;

import java.util.Iterator;


public class EngineeringIterator implements Iterator {

	Program[] programs;
	int index = 0;
	
	public EngineeringIterator (Program[] programs) {
		this.programs = programs;
	}
	
	
	@Override
	public boolean hasNext() {
		if (index >= programs.length || programs[index] == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public Object next() {
		Program program = programs[index];
		index +=1;
		return program;
	}

}
