package Channel;

import java.util.ArrayList;
import java.util.Iterator;

public class Client {

	public static void main(String[] args) {
		/*MMAchannels mmaChannels = new MMAchannels();
		printChannels(mmaChannels.createIterator());
		
		MakeupChannels makeupChannels = new MakeupChannels();
		printChannels(makeupChannels.createIterator());*/
		ArrayList<ChannelCollection> collections = new ArrayList<>();
		
		MakeupChannels makeup = new MakeupChannels();
		MMAchannels mma = new MMAchannels();
		
		collections.add(makeup);
		collections.add(mma);
		
		Iterator<ChannelCollection> collectionIterator = collections.iterator();
		
		while (collectionIterator.hasNext()==true) {
			ChannelCollection curr = collectionIterator.next();
			System.out.println("============"+curr.channelName()+"===========");
			printChannels(curr.createIterator());
		}
		
		
		
	}
	
	public static void printChannels(Iterator iterator) {
		while(iterator.hasNext() == true) {
			Channel c = (Channel) iterator.next();
			System.out.println(c.getName() + " " + c.getType());
		}
		
	}

}
