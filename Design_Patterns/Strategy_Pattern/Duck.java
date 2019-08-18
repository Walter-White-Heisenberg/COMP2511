package Strategy;

public abstract class Duck {
	
	// should aggregate the strategy interface
	FlyBehaviour flybehaviour;
	
	
	public abstract void display();
	
	public void quack() {
		System.out.println("duck can quack~");
	}

	public void swim() {
		System.out.println("duck can swim~");
	}
	
	public void fly() {
		if (flybehaviour != null) {
			flybehaviour.fly();
		}
	}

	public void setFlybehaviour(FlyBehaviour flybehaviour) {
		this.flybehaviour = flybehaviour;
	}
	
	
}

