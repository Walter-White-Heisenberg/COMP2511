package observer_pattern;
import java.util.ArrayList;
public class Subject2 implements Subject {
	// now lets say this subject2 is representing NEWS
	// We need to have a list of the subscribers
	ArrayList<Observer> subscribers = new ArrayList<Observer>();
	String news = "";
	@Override
	public void add(Observer observer) {
		// TODO Auto-generated method stub
		subscribers.add(observer);
	}

	@Override
	public void remove(Observer observer) {
		// TODO Auto-generated method stub
		subscribers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		// notify every single subscribers
		for (Observer obs : subscribers) {
			obs.update(this);
		}
	}

	public String getNews() {
		return news;
	}

	public void setNews(String news) {
		this.news = news;
		notifyObservers();
	}

}
