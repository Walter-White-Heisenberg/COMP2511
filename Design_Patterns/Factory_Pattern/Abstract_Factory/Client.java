package Abstract_Factory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactoryTypeA typea = new FactoryTypeA();
		FactoryTypeB typeb = new FactoryTypeB();
		OrderPizza order = new OrderPizza(typeb);
		
	}

}
