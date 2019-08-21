package MakeupChannels;

public class Subscriber1 implements Subscribers{
	String Jmessages = "";
	
	
	@Override
	public void update(YoutubeChannels channel) {
		if (channel instanceof JeffreeStar) {
			Jmessages = ((JeffreeStar) channel).getMessage();
			System.out.println("Channel: " + ((JeffreeStar) channel).getChannelName() + "Messages: " + Jmessages);
		}
		
	}

}
