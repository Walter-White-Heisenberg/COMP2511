package SimpleFactory;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Factory1.*;

public class PrepareOrder {

	public PrepareOrder(SimpleFactory simple) {
		setFactory(simple);
	}
	
	// get a simple factory object
	SimpleFactory factory;
	Pizza pizza = null;
	
	public void setFactory(SimpleFactory simple) {
		String orderType = "";
		
		this.factory = simple;
		do {
			orderType = getType();
			pizza = factory.createPizza(orderType);
			if (pizza != null) {
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
			} else {
				System.out.println("no such pizza");
			}
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
