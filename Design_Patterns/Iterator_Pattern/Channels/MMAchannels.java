package Channel;

import java.util.Iterator;

public class MMAchannels implements ChannelCollection {
	Channel[] channels;
	int position = 0;
	
	public MMAchannels() {
		channels = new Channel[2];
		addChannel("UFC", "MMA");
		addChannel("ESPN", "MMA");
	}
	
	public String channelName() {
		return "MMA Channels";
	}
	
	public void addChannel(String name, String type) {
		Channel curr = new Channel(name, type);
		channels[position] = curr;
		position = position + 1;
	}
	
	@Override
	public Iterator createIterator() {
		MMAiterator MMAiterator = new MMAiterator(channels);
		return MMAiterator;
	}

}
