package Strategy;

public class Client {

	public static void main(String[] args) {
		Duck toyduck = new ToyDuck();
		toyduck.fly();
		
		WildDuck wildduck = new WildDuck();
		wildduck.fly();
		
		PekingDuck pekingduck = new PekingDuck();
		pekingduck.fly();
		pekingduck.setFlybehaviour(new NoFly());
		pekingduck.fly();
	}

}
