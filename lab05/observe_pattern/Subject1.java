package observer_pattern;
import java.util.ArrayList;

public class Subject1 implements Subject {

	// contains a list of observers
	ArrayList<Observer> subscribers = new ArrayList<Observer>();
	
	// temperature attribute
	double temperature = 0.0;
	
	@Override
	public void add(Observer observer) {
		// TODO Auto-generated method stub
		subscribers.add(observer);
		// append the new observer in the end
		
	}

	@Override
	public void remove(Observer observer) {
		// TODO Auto-generated method stub
		subscribers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for (Observer obs : subscribers) {
			obs.update(this);
		}
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
		// everytime temperature changes, notify the clients
		notifyObservers();
	}

}
