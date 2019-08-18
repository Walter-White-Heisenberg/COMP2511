package decorator_coffee;

public class CoffeeBar {
	public static void main(String[] args) {
		Drink order = new LongBlack();
	    order = new Milk(order);
	    order = new Chocolate(order);
	    order = new Chocolate(order);
		System.out.println(order.cost());
		System.out.println(order.getDescription());
	}
}
