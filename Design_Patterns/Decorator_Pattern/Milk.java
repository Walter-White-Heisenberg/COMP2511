package decorator_coffee;

public class Milk extends Decorator {

	public Milk(Drink coffee) {
		super(coffee);
		
		setDescription("milk");
		setPrice(2.0);
	}

		
}
