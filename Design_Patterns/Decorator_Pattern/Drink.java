package decorator_coffee;

public abstract class Drink {
	// description of the drink
	public String description;
	private double price = 0.0;
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	// an abstract method 
	public abstract double cost();
	
}
