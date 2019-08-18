package Visitor_singer;

public class Client {

	public static void main(String[] args) {
		ObjectStructure structure = new ObjectStructure();
		structure.attachPerson(new Man());
		structure.attachPerson(new Woman());
		
		Action success = new Success();
		Action fail = new Fail();
		
		structure.display(success);
		
	}

}
