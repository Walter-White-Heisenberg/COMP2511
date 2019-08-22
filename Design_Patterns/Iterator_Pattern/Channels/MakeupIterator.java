package Channel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class MakeupIterator implements Iterator{
	List<Channel> channel;
	int position = 0;
	public MakeupIterator(List<Channel> channel) {
		this.channel = channel;
	}
	@Override
	public boolean hasNext() {
		if (position >= channel.size()) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public Object next() {
		Channel curr = channel.get(position);
		position = position +1;
		return curr;
	}

}
