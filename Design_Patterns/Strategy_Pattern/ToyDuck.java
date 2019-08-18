package Strategy;


public class ToyDuck extends Duck {

	public ToyDuck() {
		flybehaviour = new NoFly();
	}
	
	
	
	@Override
	public void display() {
		System.out.println("its a toy");
		
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("toy cannot quack");
	}

	@Override
	public void swim() {
		System.out.println("toy cannot swim");
	}

}
