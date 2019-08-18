package template_video;

public abstract class SoyMilk {

	// template method -> makeSoyMilk()
	// put it as final so nothing can change it
	
	final void make() {
		select();
		if (chooseToAdd()) {
			add();
		}
		soak();
		mix();
		
	}
	
	private void select() {
		System.out.println("1. select yellow beans for the soymilk base");
	}
	
	// different additions for the soymilk to make it different flavour
	public abstract void add();
	
	private void soak() {
		if (!chooseToAdd()) {
			System.out.println("2. put everything in the water to prepare for the mix");
		} else {
			System.out.println("3. put everything in the water to prepare for the mix");
		}
	}
	
	private void mix() {
		if (!chooseToAdd()) {
			System.out.println("3. mixing the beans to make the soy milk");
		} else {
			System.out.println("4. mixing the beans to make the soy milk");
		}
		
	}
	
	public boolean chooseToAdd() {
		return true;
	}
	
	
	
}
