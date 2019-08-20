package Abstract_Factory;

public class FactoryTypeB implements AbstractFactory {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if (type.equals("cheese")) {
			pizza = new TypeBCheesePizza();
		} else if (type.equals("pepper")) {
			pizza = new TypeBPepperPizza();
		}
		return pizza;
	}

}
