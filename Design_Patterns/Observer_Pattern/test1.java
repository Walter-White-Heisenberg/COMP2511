package observer_pattern;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject1 temperature = new Subject1();
		Subject2 news = new Subject2();
		Observer client = new Observer1();
		// make the client subscribe channels
		news.add(client);
		temperature.add(client);
		// now temperature changes
		temperature.setTemperature(25);
		temperature.setTemperature(42);
		// news changes
		news.setNews("Daily news 1");
		news.setNews("Daily news 2");

		
		
	}

}
