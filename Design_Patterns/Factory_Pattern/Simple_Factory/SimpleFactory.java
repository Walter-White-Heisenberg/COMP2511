package SimpleFactory;

import Factory1.*;

public class SimpleFactory {
	public Pizza createPizza(String pizzaType) {
		Pizza pizza = null;
		if (pizzaType.equals("greek")) {
			pizza = new GreekPizza();
			pizza.setName(pizzaType);
		} else if (pizzaType.equals("cheese")) {
			pizza = new CheesePizza();
			pizza.setName(pizzaType);
		}
		return pizza;
	}
	
}
