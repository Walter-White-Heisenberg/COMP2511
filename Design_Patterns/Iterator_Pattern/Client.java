package Iterator;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		
		List<Faculty> faculties = new ArrayList<>();
		CSE cse = new CSE();
		
		CseIterator it = new CseIterator(cse.programs);
		
		
		faculties.add(cse);
		faculties.add(new Engineering());
		
		Output output = new Output(faculties);
		output.PrintFaculties();

		
		

	}

}
