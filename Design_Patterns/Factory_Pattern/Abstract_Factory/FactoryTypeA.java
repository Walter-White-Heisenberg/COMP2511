package Abstract_Factory;

public class FactoryTypeA implements AbstractFactory {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if (type.equals("cheese")) {
			pizza = new TypeACheesePizza();
		} else if (type.equals("pepper")) {
			pizza = new TypeAPepperPizza();
		}
		return pizza;
	}

}
