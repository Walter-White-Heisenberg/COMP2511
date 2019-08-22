package YoutubeChannels;

import java.util.ArrayList;

public class Type_composite implements Youtube_Component{
	private String type;
	ArrayList<Youtube_Component> components = new ArrayList<>();
	
	public Type_composite(String type) {
		this.type = type;
	}
	
	@Override
	public boolean add(Youtube_Component component) {
		components.add(component);
		return true;
	}

	@Override
	public boolean remove(Youtube_Component component) {
		components.remove(component);
		return true;
	}

	@Override
	public String showComponents() {
		String string = type;
		string = string + "(";
		for (Youtube_Component c : components) {
			string = string + " " + c.showComponents();
		}
		string = string + ")";
		return string;
	}

}
