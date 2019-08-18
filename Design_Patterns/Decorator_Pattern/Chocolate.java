package decorator_coffee;

public class Chocolate extends Decorator{

	public Chocolate(Drink coffee) {
		super(coffee);
		setDescription("chocolate");
		setPrice(3.0);
	}

}
