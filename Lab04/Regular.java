package unsw.movies;

public class Regular implements Price {
	Movie movie;
	public Regular(Movie movie){
		this.movie = movie;
	}
	
    @Override
	public Price becomeRegular() {
		// TODO Auto-generated method stub
    	System.out.println("This movie is already a Regular-type movie");
		return this;
	}

	@Override
	public Price becomeClassics() {
		// TODO Auto-generated method stub
		System.out.println("This movie becomes a Classic-type movie");
		return new Classics(movie);
	}

	@Override
	public Price becomeChildrens() {
		// TODO Auto-generated method stub
		System.out.println("This movie becomes a Childrens-type movie");
		return new Childrens(movie);
	}

	
    @Override
    public double getCharge(int daysRented) {
        double charge = 2;
        if (daysRented > 2)
            charge += (daysRented - 2) * 1.5;
        return charge;
    }

}
