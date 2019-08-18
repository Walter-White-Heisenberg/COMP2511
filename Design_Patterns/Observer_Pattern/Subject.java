package observer_pattern;

public interface Subject {

	public void add (Observer observer);
	public void remove (Observer observer);
	public void notifyObservers();
}
