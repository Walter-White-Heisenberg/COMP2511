package decorator_coffee;

public class Decorator extends Drink {

	private Drink coffee;
	
	public Decorator (Drink coffee) {
		this.coffee = coffee;
	}
	
	@Override
	public double cost() {
		return getPrice() + coffee.cost();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return description + " " + getPrice() + " && " + coffee.getDescription();
	}

	
}
