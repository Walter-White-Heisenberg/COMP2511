package Factory1_PrepareOrder;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Factory1.*;

public class PrepareOrder {

	// write a Constructor to prepare the order
	public PrepareOrder() {
		Pizza pizza = null;
		String pizzaType;
		do {
			pizzaType = getType();
			if (pizzaType.equals("greek")) {
				pizza = new GreekPizza();
				pizza.setName(pizzaType);
			} else if (pizzaType.equals("cheese")) {
				pizza = new CheesePizza();
				pizza.setName(pizzaType);
			} else {
				break;
			}
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();
		} while(true);
	}

	private String getType() {
		// when you are writing a function to get the input you need try..catch
		try {
			BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("please input the pizza type: ");
			String type = stdin.readLine();
			return type;
		} catch (IOException e){
			e.printStackTrace();
			return "";
		}
	}
	
}
