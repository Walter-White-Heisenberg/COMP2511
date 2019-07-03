package unsw.movies;

// price is a state, and it has different types of state: children/newRelease/Regular
public interface Price {
	// because of the charge varies when state changes
	// thus we need a getCharge()
	/*protected Price price;
    public abstract double getCharge(int daysRented);
    
    public void setPrice(Price price) {
    	this.price = price;
    }*/
	
	// transition method
	public Price becomeRegular();
	public Price becomeClassics();
	public Price becomeChildrens();
	public double getCharge(int daysRented);
	
}
