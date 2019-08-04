package unsw.movies;

public class Movie {
    /*public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    public static final int CHILDRENS = 2;*/
	
	Price regularPrice = new Regular(this);
	Price newReleasePrice = new NewRelease(this);
	Price childrensPrice = new Childrens(this);
	Price classicPrice = new Classic(this);

    private String title;
    private Price price;

    public Movie(String title) {
        this.title = title;
        this.price = newReleasePrice;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getCharge(int daysRented) {
        return price.getCharge(daysRented);
    }

	public Price getRegularPrice() {
		return regularPrice;
	}
	public Price getNewReleasePrice() {
		return newReleasePrice;
	}
	public Price getChildrensPrice() {
		return childrensPrice;
	}
	public Price getClassicPrice() {
		return classicPrice;
	}

    public void changeToRegular() {
    	price.changeToRegular();
    }
    public void changeToClassic() {
    	price.changeToClassic();
    }
    public void changeToNewRelease() {
    	price.changeToNewRelease();
    }
    public void changeToChildren() {
    	price.changeToChildren();
    }
    
    

}