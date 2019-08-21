package MovieRenting;

public class Movies {
	CalculateMethods costMethod;
	
	private String description;
	private double cost;
	private int days;
	
	public Movies(int days) {
		this.days = days;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getCost() {
		if (costMethod != null) {
			this.cost = costMethod.cost(days);
		}
		return cost;
	}

	
	
	public void setMethod(CalculateMethods method) {
		costMethod = method;
	}
	
	
}
