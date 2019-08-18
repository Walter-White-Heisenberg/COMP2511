package Strategy;

public class WildDuck extends Duck{

	public WildDuck() {
		flybehaviour = new GoodAtFly();
	}
	
	
	@Override
	public void display() {
		System.out.println("this is wild-duck");		
	}

}
