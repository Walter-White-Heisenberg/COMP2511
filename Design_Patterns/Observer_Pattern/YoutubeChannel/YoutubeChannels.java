package MakeupChannels;

public interface YoutubeChannels {
	public void registerSubscriber(Subscribers subscriber);
	public void removeSubscriber(Subscribers subscriber);
	public void notifySubscribers();
}
