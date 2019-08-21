package MakeupChannels;

public class Client {

	public static void main(String[] args) {
		JeffreeStar starChannel = new JeffreeStar();
		Subscriber1 sub1 = new Subscriber1();
		starChannel.registerSubscriber(sub1);
		starChannel.newVideoAlarm("New JeffreeStar x Morphe eyeshadow palette is out!");

	}

}
