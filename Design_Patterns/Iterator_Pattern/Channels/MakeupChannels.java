package Channel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MakeupChannels implements ChannelCollection {
	List<Channel> channels;
	
	public MakeupChannels() {
		channels = new ArrayList<>();
		addChannel("Tati", "Makeup");
		addChannel("JeffreeStar", "Makeup");
		addChannel("HelloCatie", "Makeup");
	}
	
	public String channelName() {
		return "MakeupChannels";
	}
	
	public void addChannel(String name, String type) {
		Channel newchannel = new Channel(name,type);
		channels.add(newchannel);
	}
	
	@Override
	public Iterator createIterator() {
		MakeupIterator iterator = new MakeupIterator(channels);
		return iterator;
	}

}
