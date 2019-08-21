package MovieRenting;

public class Movies {
	CalculateMethods costMethod1 = new CostMethod1(this);
	CalculateMethods costMethod2 = new CostMethod2(this);
	CalculateMethods costMethod3 = new CostMethod3(this);
	
	CalculateMethods method;
	
	private String description;
	private double cost;
	private int days;
	
	public Movies(int days) {
		method = costMethod1;
		this.days = days;
	}

	public void changeToMethod1() {
		method.changeToMethod1();
	}
	public void changeToMethod2() {
		method.changeToMethod2();
	}
	public void changeToMethod3() {
		method.changeToMethod3();
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getCost() {
		if (method != null) {
			this.cost = method.cost(days);
		}
		return cost;
	}
	
	
	public void setMethod(CalculateMethods method) {
		this.method = method;
	}

	public CalculateMethods getCostMethod1() {
		return costMethod1;
	}

	public CalculateMethods getCostMethod2() {
		return costMethod2;
	}

	public CalculateMethods getCostMethod3() {
		return costMethod3;
	}
	
	
	
	
}
