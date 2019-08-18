package Iterator;

import java.util.Iterator;

public interface Faculty {
	
	public Iterator getIterator();
	
	public void addProgram(int code, String name);

	public String getFacultyName();
}
