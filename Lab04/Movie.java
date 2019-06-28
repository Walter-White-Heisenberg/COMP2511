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
    
    public void after2month() {
    	price.after2month();
    }
    
    public void getAward() {
    	price.getAward();
    }
    public Price getNewRelease() {
		return NewRelease;
	}

	public Price getRegular() {
		return Regular;
	}

	public Price getClassics() {
		return Classics;
	}

	public Price getChildrens() {
		return Childrens;
	}

	public Price getPrice() {
		return price;
	}

	public void setPrice(Price price) {
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