package Channel;
import java.util.Iterator;
public class MMAiterator implements Iterator{

	Channel[] mmaChannels;
	int position = 0;
	
	public MMAiterator(Channel[] mmaChannels) {
		this.mmaChannels = mmaChannels;
	}
	
	@Override
	public boolean hasNext() {
		if (position >= mmaChannels.length || mmaChannels[position] == null) {
			return false;
		}else {
			return true;
		}
	}

	@Override
	public Object next() {
		Channel current = mmaChannels[position];
		position = position + 1;
		return current;
	}

}
