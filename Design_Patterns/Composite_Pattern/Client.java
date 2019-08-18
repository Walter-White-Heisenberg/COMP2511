package University_case;

public class Client {

	public static void main(String[] args) {
		OrganizationComponent university = new University("unsw");
		
		
		OrganizationComponent engineering = new Faculty("engineering");
		OrganizationComponent cse = new Faculty("computer science and engineering");
		
		engineering.add(new Program("1111", "civil engineering"));
		engineering.add(new Program("2222", "Chemical engineering"));
		engineering.add(new Program("3333", "Material science and engineering"));
		
		cse.add(new Program("3778","computer science"));
		cse.add(new Program("5555", "Software engineering"));
		
		university.add(cse);
		university.add(engineering);
		
		System.out.println(university.printList());
	}

}
