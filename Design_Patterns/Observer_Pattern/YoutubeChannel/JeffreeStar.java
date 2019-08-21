package MakeupChannels;

import java.util.ArrayList;

public class JeffreeStar implements YoutubeChannels {
	private String channelName = "JefreeStar's youtube channel";
	private String message;
	ArrayList<Subscribers> subscribers = new ArrayList<>();
	
	public void newVideoAlarm(String message) {
		this.message = message;
		notifySubscribers();
	}
	
	public String getChannelName() {
		return channelName;
	}

	public String getMessage() {
		return message;
	}


	@Override
	public void registerSubscriber(Subscribers subscriber) {
		subscribers.add(subscriber);	
	}

	@Override
	public void removeSubscriber(Subscribers subscriber) {
		subscribers.add(subscriber);
	}

	@Override
	public void notifySubscribers() {
		for (Subscribers sub : subscribers) {
			sub.update(this);
		}
		
	}

}
