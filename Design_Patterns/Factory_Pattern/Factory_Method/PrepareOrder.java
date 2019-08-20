package Factory_Method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class PrepareOrder {
	
	public PrepareOrder() {
		// check the type first
		Pizza pizza = null;
		String pizzaType = "";
		
		do {
			pizzaType = getPizzaType();
			pizza = createPizza(pizzaType);
			if (pizza != null) {
				pizza.setName(pizzaType);
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
			} else {
				System.out.println("no such pizza");
			}
		} while (true);
		
	}
	
	public abstract Pizza createPizza(String pizzaType);
	
	public String getPizzaType() {
		try {
			BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("which type of pizza do you want to order: ");
			String type = stdin.readLine();
			return type;
		}catch(IOException e) {
			e.printStackTrace();
			return "";
		}
	}
}
