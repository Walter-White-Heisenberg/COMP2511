package decorator_coffee;

public class Soy extends Decorator {

	public Soy(Drink coffee) {
		super(coffee);
		setDescription("soy milk");
		setPrice(1.5);
	}

		
}
