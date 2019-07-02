package observer_pattern;

public class Observer1 implements Observer {
	// subscribe temperature channel
	double temp = 0.0;
	// subscribe news channer
	String news = "";
	@Override
	public void update(Subject subject) {
		// TODO Auto-generated method stub
		// make sure whatever subject you give me need to be an instance of Subject1
		// lets say now Observer1 is a client
		// And as a client, i want to subscribe temperature, not news, thus we need the following if statement
		// to make sure that what we're spending money on is actually temperature
		if (subject instanceof Subject1) {
			// if the subject is an instance of temperature, which means we're currently subscribing temperature
			// then we don't need the following step
			// subject = new Subject1()
			temp = ((Subject1) subject).getTemperature();
			displayTemp();
		}
		if (subject instanceof Subject2) {
			news = ((Subject2) subject).getNews();
			displayNews();
		}
	}
	
	public void displayTemp() {
		System.out.printf("Temperature is %.2f \n", temp);
	}
	public void displayNews() {
		System.out.println("Recent updated new: " + news);
	}

}
