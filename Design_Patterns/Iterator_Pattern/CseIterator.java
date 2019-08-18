package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class CseIterator implements Iterator {

	List<Program> programs;
	int index = 0;
	
	public CseIterator (List<Program> program) {
		this.programs = program;
	}
	
	@Override
	public boolean hasNext() {
		if (index >= programs.size()) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public Object next() {
		Program program = programs.get(index);
		index += 1;
		return program;
	}

	
	

}
