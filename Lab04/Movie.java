package unsw.movies;

public class Movie {
    
	Price NewRelease;
	Price Regular;
	Price Classics;
	Price Childrens;
	
	Price price;
	// movie is like the context
	
	// define one price as we need to use that interface which is the "state"
	//private Price price;
	private String title;
	
	/*public void setPrice(Price price) {
		this.price = price;
	}*/

    public Movie(String title) {
    	//this.price = price;
    	this.title = title;
        NewRelease = new NewRelease(this);
        Regular = new Regular(this);
        Classics = new Classics(this);
        Childrens = new Childrens(this);
    }
    
    public void becomeClassic() {
    	price = price.becomeClassics();
    }

    public void becomeChildrens() {
    	price = price.becomeChildrens();
    }
    
    public void becomeRegular() {
    	price = price.becomeRegular();
    }
    
    public Price getNewRelease() {
		return NewRelease;
	}


	public Price getPrice() {
		return price;
	}

	protected void setPrice(Price price) {
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getCharge(int daysRented) {
        return price.getCharge(daysRented);
    }

};