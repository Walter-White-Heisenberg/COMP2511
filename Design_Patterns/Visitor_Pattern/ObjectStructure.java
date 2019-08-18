package Visitor_singer;

import java.util.LinkedList;
import java.util.List;

public class ObjectStructure {

	// contains a collection 
	private List<Person> personList= new LinkedList<>();
	
	public void attachPerson(Person p) {
		personList.add(p);
	}
	
	public void detachPerson(Person p) {
		personList.remove(p);
	}
	
	public void display(Action action) {
		for (Person p : personList) {
			p.accept(action);
		}
	}
}
