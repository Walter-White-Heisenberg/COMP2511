package Strategy;

public class PekingDuck extends Duck {

	public PekingDuck() {
		flybehaviour = new BadAtFly();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("this is pecking duck it cannot fly");
	}

	

}
