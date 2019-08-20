package Factory_Method;

public class PrepareOrderB extends PrepareOrder {

	@Override
	public Pizza createPizza(String pizzaType) {
		
		Pizza pizza = null;
		if (pizzaType.equals("cheese")) {
			pizza = new TypeBCheesePizza();
		} else if (pizzaType.equals("pepper")) {
			pizza = new TypeBPepperPizza();
		}
		return pizza;
	}

}
