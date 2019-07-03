package unsw.movies;

public class NewRelease implements Price {
	Movie movie;
	public NewRelease(Movie movie) {
		this.movie = movie;
	}
	
    @Override
	public Price becomeRegular() {
		// TODO Auto-generated method stub
    	System.out.println("This movie becomes a Regular-type movie");
		return new Regular(movie);
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
        return daysRented * 3;
    }

}
