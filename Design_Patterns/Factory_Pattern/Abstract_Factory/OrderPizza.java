package Abstract_Factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.sun.javadoc.Type;

public class OrderPizza {

	public OrderPizza(AbstractFactory factory) {
		setFactory(factory);
	}
	AbstractFactory factory;
	
	public void setFactory(AbstractFactory factory) {
		this.factory = factory;
		Pizza pizza = null;
		String type = "";
		
		do {
			type = getPizzaType();
			pizza = factory.createPizza(type);
			
			if (pizza != null) {
				if (type.equals("cheese")) {
					pizza.setName("cheese");
				} else if (type.equals("pepper")) {
					pizza.setName("pepper");
				}
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
				
			} else {
				System.out.println("incorrect pizza type");
			}
		} while(true);
		
		
	}
	public String getPizzaType() {
		try {
			BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("what type of pizza do you want to order: ");
			String type = stdin.readLine();
			return type;
		} catch(IOException e) {
			e.printStackTrace();
			return "";
		}
	}

}
