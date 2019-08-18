package University_case;

public class Program implements OrganizationComponent{
	private String code;
	private String name;
	
	public Program(String code, String name) {
		this.code = code;
		this.name = name;
	}
	@Override
	public boolean add(OrganizationComponent component) {
		// because of its a leaf component so no add
		return false;
	}
	@Override
	public boolean remove(OrganizationComponent component) {
		// because of its a leaf component so no remove as well
		return false;
	}
	@Override
	public String printList() {
		String info = "( " + code + ", " + name + " )";
		return info;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}