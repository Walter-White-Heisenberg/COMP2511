package YoutubeChannels;

public class Channels_leaf implements Youtube_Component {
	private String name;
	public Channels_leaf(String name) {
		this.name = name;
	}
	@Override
	public boolean add(Youtube_Component component) {
		return false;
	}

	@Override
	public boolean remove(Youtube_Component component) {
		return false;
	}

	@Override
	public String showComponents() {
		return name;
	}

}
