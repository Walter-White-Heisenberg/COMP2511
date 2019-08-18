package University_case;

import java.util.ArrayList;
import java.util.List;

public class University implements OrganizationComponent {
	private String name;
	private List<OrganizationComponent> programList = new ArrayList<>();
	
	public University(String name) {
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
		String list = "*"+name+"*"+"\n ";
		for (OrganizationComponent program : programList) {
			list += program.printList();
		}
		
		return list;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
