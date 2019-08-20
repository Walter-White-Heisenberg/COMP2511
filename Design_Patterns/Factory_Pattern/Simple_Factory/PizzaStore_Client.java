package SimpleFactory;

public class PizzaStore_Client {

	public static void main(String[] args) {
		SimpleFactory simple = new SimpleFactory();
		PrepareOrder order = new PrepareOrder(simple);
	}

}
