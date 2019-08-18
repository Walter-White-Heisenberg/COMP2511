package Strategy;

public class NoFly implements FlyBehaviour {

	@Override
	public void fly() {
		System.out.println("cannot fly");
		
	}

}
