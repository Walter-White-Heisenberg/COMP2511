package Factory_Method;

public class PrepareOrderA extends PrepareOrder {

	@Override
	public Pizza createPizza(String pizzaType) {
		Pizza pizza = null;
		if (pizzaType.equals("cheese")) {
			pizza = new TypeACheesePizza();
		} else if (pizzaType.equals("pepper")) {
			pizza = new TypeAPepperPizza();
			pizza.setName("pepper");
		}
		return pizza;
	}

}
