package Channel;

import java.util.Iterator;

public interface ChannelCollection {
	public Iterator createIterator();
	public String channelName();
}
