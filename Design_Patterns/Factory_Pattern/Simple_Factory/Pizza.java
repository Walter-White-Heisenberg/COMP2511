package Factory1;

public abstract class Pizza {
	protected String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void prepare();
	
	public void bake() {
		System.out.println("Now baking "+ name + " pizza...");
	}
	
	public void cut() {
		System.out.println("Now cutting "+ name + " pizza...");
	}
	
	public void box() {
		System.out.println("Now boxing "+ name + " pizza...");
	}
	
	
}
