package statePattern;

public class Client {

	public static void main(String[] args) {
		Activity activity = new Activity(2);
		for (int i=0; i<30;i++) {
			System.out.println("----------this is #" + i + "times-----------");
			activity.deductPoints();
			activity.raffle();
		}

	}

}
