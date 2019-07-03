package unsw.movies;

public class Childrens implements Price {
	Movie movie;
	public Childrens(Movie movie) {
		this.movie = movie;
	}

	
    @Override
	public Price becomeRegular() {
		// TODO Auto-generated method stub
    	System.out.println("Becomes Regular-type movie");
		return new Regular(movie);
	}


	@Override
	public Price becomeClassics() {
		// TODO Auto-generated method stub
		System.out.println("Becomes Classic-type movie");
		return new Classics(movie);
	}


	@Override
	public Price becomeChildrens() {
		// TODO Auto-generated method stub
		System.out.println("This is already a Childrens movie");
		return this;
	}


	@Override
    public double getCharge(int daysRented) {
    	// 1.5 one day
        double charge = 1.5;
        if (daysRented > 3)
        	// charge = charge + (rent days-3)*1.5
            charge += (daysRented - 3) * 1.5;
        return charge;
    }

}
