package University_case;

import java.util.ArrayList;
import java.util.List;

public class Faculty implements OrganizationComponent {

	private String name;
	private List<OrganizationComponent> programList = new ArrayList<>();
	
	public Faculty(String name) {
		this.name = name;
	}
	
	@Override
	public boolean add(OrganizationComponent component) {
		programList.add(component);
		return true;
	}

	@Override
	public boolean remove(OrganizationComponent component) {
		programList.remove(component);
		return true;
	}

	@Override
	public String printList() {
		String title = "======="+name+"======="+"\n ";
		String list = "[ ";
		for (OrganizationComponent program : programList) {
			list = list + " " + program.printList();
		}
		list = list + " ]\n";
		return title+list;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
